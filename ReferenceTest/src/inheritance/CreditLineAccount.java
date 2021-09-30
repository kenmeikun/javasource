package inheritance;

public class CreditLineAccount extends Account2 {
	private int creditLine;//마이너스 한도
	public CreditLineAccount(String num, int money, String name,int creditLine) {
		super(num, money, name);
		this.creditLine=creditLine;
	}
//계좌번호,계좌주,잔액,마이너스한도/ 입금하다,출금하다
	
//출금하다 오버라이딩
//부모의 기능 : 잔액=잔액-출금액
//자식:잔액(현재잔액+마이너스 한도)
	@Override
	int output(int amount) {
		//현재잔액+마이너스한도필드보다 사용금액이 많으면 인출불가 메세지 출력,0을 리턴 
		if (amount>getMoney()+creditLine ) {
			System.out.println("사용금액 한도 초과.");
			return 0;
		}
		setmoney(getMoney()-amount);
		//잔액(현재잔액+마이너스 한도)-출금액
		return getMoney();
	}
	
}
