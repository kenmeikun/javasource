package exception;

// main���� throws �� �ǹ�:jvm���� �������� �ǹ�=>ȭ�����
public class ThrowEx {
	public static void main(String[] args) {
		
		try {
			findClass();
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}
	}
	
	//throws: ���⼭ �߻��� ���ܸ� �� �޼ҵ带 ȣ���ϴ� ������ ��������
 public static void findClass() throws ClassNotFoundException {
	Class.forName("");
	
}

}
	