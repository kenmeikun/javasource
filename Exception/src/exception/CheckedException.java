package exception;


//exception���ܻ���
//checkedException:compile �� ��Ÿ���� ����
//uncheckedException:runŸ�ӽ� ��Ÿ���� ����
public class CheckedException {

	public static void main(String[] args) {
		//ClassNotFoundException
		try {
			Class.forName("java.long.String");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
