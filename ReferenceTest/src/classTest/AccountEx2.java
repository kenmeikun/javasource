package classTest;

public class AccountEx2 {

	public static void main(String[] args) {
		//홍길도 계좌
		Account2 account1=new Account2();
//		account1.num="122-01-04444";
//		account1.money=10000;
//		account1.name="아이유";
		
		//생성자사용하지않고 맴버변수초기화
		account1.setmoney(100000);
		//계좌번호
		account1.setnum("122-01-04444");
		//이름
		account1.setname("길도이");
		//입금
		account1.input(50000);
		System.out.println("입금후 잔액:");
		
		//출금
	System.out.println("현재금액:"+account1.output(20000))	;
	//성춘향계좌
	Account2 account2 =new Account2("122-01-0444 ","성춘향");
	
	Account2 account3 =new Account2("122-01-0444 ",1000000,"문재인");
	System.out.println();
	}//ㅡ먀ㅠ

	
	
}
