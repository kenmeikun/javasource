package inheritance;

public class BonusPointAccount extends Account2{
	
	private int bonusPoint;
	
	public BonusPointAccount(String num, int money, String name,int bonusPoint) {
		super(num, money, name);
		this.bonusPoint=bonusPoint;
	}
	//계좌번호,계좌주,보너스포인트/ 입금하다,출금하다,보너스 포인트 추가
	@Override
	void input(int amount) {
		//예금하다,
		//setmoney(getMoney()+amount);
		
		super.input(amount);
		//보너스포인트+=예금액의0.1% 보너스 포인트
		bonusPoint+=amount*0.001;
		
	}//input
	
	public int getbonusPoint() {
		return bonusPoint;
	}
	
}//class
