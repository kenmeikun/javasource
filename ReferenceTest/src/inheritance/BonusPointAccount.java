package inheritance;

public class BonusPointAccount extends Account2{
	
	private int bonusPoint;
	
	public BonusPointAccount(String num, int money, String name,int bonusPoint) {
		super(num, money, name);
		this.bonusPoint=bonusPoint;
	}
	//���¹�ȣ,������,���ʽ�����Ʈ/ �Ա��ϴ�,����ϴ�,���ʽ� ����Ʈ �߰�
	@Override
	void input(int amount) {
		//�����ϴ�,
		//setmoney(getMoney()+amount);
		
		super.input(amount);
		//���ʽ�����Ʈ+=���ݾ���0.1% ���ʽ� ����Ʈ
		bonusPoint+=amount*0.001;
		
	}//input
	
	public int getbonusPoint() {
		return bonusPoint;
	}
	
}//class
