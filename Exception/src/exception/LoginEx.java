package exception;

public class LoginEx {

	public static void main(String[] args) {
		
				
		try {
			login("white","12345");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			login("blue","54321");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}//main
	
	public static void login(String id,String password) throws Exception {
		//id��"blue"�� �ƴ϶�� NotExistIDExceptoon �߻���Ŵ
		
		if (!id.contentEquals("blue")) {
			throw new NotExistIDExceptoon("���̵� �������� �ʽ��ϴ�");
		}
		//password�� "12345"���ƴ϶��wrongpasswordexception�߻�

		if (!password.contentEquals("12345")) {
			throw new WrongPasswordException("�н����尡 Ʋ���ϴ�.");
		}
	}

}
