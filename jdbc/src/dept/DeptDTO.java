package dept;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//���̺� ���� �Ȱ��� �ۼ�

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class DeptDTO {
	private int deptNo;
	private String dname;
	private String loc;
	
	//������,getter,setter,toString
	
}
