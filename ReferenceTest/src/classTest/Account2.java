package classTest;

public class Account2 {
	//�Ӽ� ���¹�ȣ,�ܾ�,�̸�
	private String num;
	private int money;
	private String name;
	
	//��� �Ա�,(�Է°�,��ȯ������,=>�����ܾ�+=�Աݾ�
	//	  ���(�Է°�,��ȯ=�����ݾ�)=>�����ܾ�-=��ݾ�
	
	
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
	
//�ܺηκ��� ���� �޾Ƽ� �ɹ��������� �����ϴ� �۾���
	//set	���� �޼ҵ带 �ۼ��Ѵ�
	
	//�ɹ�����:���¹�ȣ�� �����ϰ� ������
	public void setnum(String num) {
		this.num=num;
		
	}
	public void setmoney(int money) {
		this.money=money;
	}
	public void setname(String name) {
		this.name=name;
	}
	//�ɹ������� ���� �����ϰ�ʹ�
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
			System.err.println("�ܾ��� �����մϴ�!!");
		}
		return money;
	}
}
