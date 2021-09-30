package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

//~DAO: �����ͺ��̽� �� ���õ� �۾� Ŭ����
//Ŀ�ؼ� ��ȸ,����,����,����

public class EmpDAO {
	// ����̹� �ε�
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static Connection getConnection() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "c##scott";
		String password = "tiger";
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	public List<EmpDTO> select() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<EmpDTO> list = new ArrayList<EmpDTO>();
		try {
			con = getConnection();
			String sql = "select * from emp_temp order by hiredate";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				EmpDTO dto = new EmpDTO();
				dto.setEmpno(rs.getInt("empno"));
				dto.setEname(rs.getString("ename"));
				dto.setJob(rs.getString("job"));
				dto.setMgr(rs.getInt("mgr"));
				dto.setHiredate(rs.getDate("hiredate"));
				dto.setSal(rs.getInt("sal"));
				dto.setComm(rs.getInt("comm"));
				dto.setDeptno(rs.getInt("deptno"));
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return list;
	}

	public EmpDTO getRow(int empno) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		EmpDTO dto = null;
		try {
			con = getConnection();
			// String sql = "select * from emp where empno=" + empno;
			String sql = "select * from emp_temp where empno=?";
			pstmt = con.prepareStatement(sql);
			// ����ǥ�� ���� ó��
			pstmt.setInt(1, empno);
			rs = pstmt.executeQuery();
			if (rs.next()) {// �ϳ��� �࿡�� �ʵ庰�� ��������+EMPDTO ���
				dto = new EmpDTO();
				dto.setEmpno(rs.getInt("empno"));
				dto.setEname(rs.getString("ename"));
				dto.setJob(rs.getString("job"));
				dto.setMgr(rs.getInt("mgr"));
				dto.setHiredate(rs.getDate("hiredate"));
				dto.setSal(rs.getInt("sal"));
				dto.setComm(rs.getInt("comm"));
				dto.setDeptno(rs.getInt("deptno"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dto;
	}

	// �޿� ��������
	public List<EmpDTO> orderBySal() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<EmpDTO> list = new ArrayList<EmpDTO>();

		try {
			con = getConnection();
			// Ŀ�ؼ������� sql ����������
			String sql = "select ename,sal from emp_temp order by sal";
			pstmt = con.prepareStatement(sql);
			// sql ���� ����
			rs = pstmt.executeQuery();
			// ���� ��� ����
			while (rs.next()) {
				EmpDTO dto = new EmpDTO();
				dto.setEname(rs.getString(1));
				dto.setSal(rs.getInt(2));
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return list;
	}

	// Ư�� ����� �޿� ����

	public boolean updateSal(int empno, int sal) {

		Connection con = null;
		PreparedStatement pstmt = null;
		boolean updateFlag = false;

		try {

			con = getConnection();

			String sql = "update emp_temp set sal=? where empno=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, sal);
			pstmt.setInt(2, empno);

			int result = pstmt.executeUpdate();
			if (result > 0) {// update ����
				updateFlag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return updateFlag;
	}

	// Ư������� �߰����� ����
	public boolean updateComm(int comm, int sal) {
		Connection con = null;
		PreparedStatement pstmt = null;
		boolean updateFlag = false;
		try {
			con=getConnection();
			String sql = "update emp_temp set comm=? where sal<=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, comm);
			pstmt.setInt(2, sal);
			int result = pstmt.executeUpdate();
			if (result > 0) {
				updateFlag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return updateFlag;
	}
	
	//���� ��� �Է�
	public boolean insertEmp(EmpDTO dto) {
		Connection con = null;
		PreparedStatement pstmt = null;
		boolean insertFlag = false;
		try {
			con =getConnection();
			String sql="insert into emp_temp(empno,ename,job,mgr,hiredate,sal,comm,deptno)";
			sql+="values(?,?,?,?,Sysdate,?,?,?)";
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1,dto.getEmpno());
			pstmt.setString(2,dto.getEname());
			pstmt.setString(3, dto.getJob());
			pstmt.setInt(4, dto.getMgr());
			pstmt.setInt(5,dto.getSal());
			pstmt.setInt(6, dto.getComm());
			pstmt.setInt(7,dto.getDeptno());
			
			int result=pstmt.executeUpdate();
			if (result>0) {
				insertFlag=true;
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return insertFlag;
	}
	//Ư�� ��� ����
	public boolean deleteEmp(int empno) {
		Connection  con=null;
		PreparedStatement pstmt=null;
		boolean deleteFlag=false;
		
		try {
			con=getConnection();
			String sql="delete emp_temp where empno=?";
			pstmt=con.prepareStatement(sql);
			 pstmt.setInt(1,empno);
			 
			int result=pstmt.executeUpdate();
			if (result>0) {
				deleteFlag=true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return deleteFlag;
	}
	
}// class