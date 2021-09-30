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
		//id가"blue"가 아니라면 NotExistIDExceptoon 발생시킴
		
		if (!id.contentEquals("blue")) {
			throw new NotExistIDExceptoon("아이디가 존재하지 않습니다");
		}
		//password가 "12345"가아니라면wrongpasswordexception발생

		if (!password.contentEquals("12345")) {
			throw new WrongPasswordException("패스워드가 틀립니다.");
		}
	}

}
