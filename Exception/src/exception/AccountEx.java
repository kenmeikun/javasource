package exception;

public class AccountEx {

	public static void main(String[] args) {
		Account account =new Account();
		
		try {
			account.withdraw(100000);
		} catch (Exception e) {
			
			//e.printStackTrace();//오류가 어디서 났는지 추적해서 출력해줌
			System.out.println(e.getMessage());//메세지만 불러줍니다.
		}
		//try는 단독으로못온다 케치나 파이널리를 가져오자

	}

}
