package inheritance;

import java.util.Scanner;

public class ChekingAccount extends Account2 {
	// 계좌번호,계좌주,잔액 =>부모
	// 입금하다,출금하다 =>부모
//	
//	카드번호(111-11-1234)
//	카드값을 지불한다
//	

	private String cardNo;

	public ChekingAccount(String num, int money, String name, String cardNo) {
		super(num, money, name);
		this.cardNo = cardNo;
	}

	int pay(String cardNo, int amount) {
		// 잔액=현재 잔액-카드사용액
		if (!cardNo.equals(this.cardNo) || getMoney() < amount) {
			System.err.println("카드번호와 사용금액을 확인해주세요.");
			return 0;
		}
		// setmoney(getMoney() - amount);
		// 부모의 output이랑 같다
		return output(amount);
	}

//카드값을 지불한다 
//입력값 :카드번호 ,사용금액 
//반환값 : 정수int 
//카드값을 지불한다.(넘어온 카드번호와 실제 발급된 카드번호와 같은지, 
//사용금액은 현재 잔액보다 작은지 확인

}
