package classTest;

public class Account2 {
	//속성 계좌번호,잔액,이름
	private String num;
	private int money;
	private String name;
	
	//기능 입금,(입력값,반환값없으,=>현재잔액+=입금액
	//	  출금(입력값,반환=현제금액)=>현재잔액-=출금액
	
	
	public Account2() {
		super();
	}

	public Account2(String num, int money, String name) {
		super();
		this.num = num;
		this.money = money;
		this.name = name;
	}
	
	public Account2(String num, String name) {
		super();
		this.num = num;
		this.name = name;
	}
	
//외부로부터 값을 받아서 맴버변수값을 변경하는 작업시
	//set	으로 메소드를 작성한다
	
	//맴버변수:계좌번호를 변경하고 싶으면
	public void setnum(String num) {
		this.num=num;
		
	}
	public void setmoney(int money) {
		this.money=money;
	}
	public void setname(String name) {
		this.name=name;
	}
	//맴버변수의 값을 리턴하고싶다
	//get~~
	public int getMoney() {
		return money;
	}
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
