package classTest;

public class Account {
	//속성 계좌번호,잔액,이름
	String num;
	int money;
	String name;
	
	//기능 입금,(입력값,반환값없으,=>현재잔액+=입금액
	//	  출금(입력값,반환=현제금액)=>현재잔액-=출금액
	
	void input(int amount) {
		money+=amount;
	}
	int output(int amount) {
		if(money>amount) {
			money-=amount;
		}else {
			System.err.println("잔액이 부족합니다!!");
		}
		return money;
	}
}
