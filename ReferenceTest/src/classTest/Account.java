package classTest;

public class Account {
	//�Ӽ� ���¹�ȣ,�ܾ�,�̸�
	String num;
	int money;
	String name;
	
	//��� �Ա�,(�Է°�,��ȯ������,=>�����ܾ�+=�Աݾ�
	//	  ���(�Է°�,��ȯ=�����ݾ�)=>�����ܾ�-=��ݾ�
	
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
