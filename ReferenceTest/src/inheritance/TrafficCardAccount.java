package inheritance;


//account2
//chekingAccount
public class TrafficCardAccount extends ChekingAccount{
	//교통카드 기능여부 
	private boolean hasTrafficCard;
	//계좌번호,계좌주,잔액,카드번호,교통카드 기능여부
	public TrafficCardAccount(String num, int money, String name, String cardNo,Boolean hasTrafficCard) {
		super(num, money, name, cardNo);
		this.hasTrafficCard=hasTrafficCard;
		
	}
	int paytrafficCard(String cardNo, int amount) {	
		if (hasTrafficCard!=true) {
		System.err.println("교통카드로 사용할수 없습니다");
		return 0;
		}
	 return pay(cardNo,amount);
	}
	//,교통카드 기능이 있다면 교통비 지불한다
	//입력값:카드번호,교통비 사용액
	//반환값:정수
	
}
