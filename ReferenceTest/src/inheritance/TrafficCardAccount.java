package inheritance;


//account2
//chekingAccount
public class TrafficCardAccount extends ChekingAccount{
	//����ī�� ��ɿ��� 
	private boolean hasTrafficCard;
	//���¹�ȣ,������,�ܾ�,ī���ȣ,����ī�� ��ɿ���
	public TrafficCardAccount(String num, int money, String name, String cardNo,Boolean hasTrafficCard) {
		super(num, money, name, cardNo);
		this.hasTrafficCard=hasTrafficCard;
		
	}
	int paytrafficCard(String cardNo, int amount) {	
		if (hasTrafficCard!=true) {
		System.err.println("����ī��� ����Ҽ� �����ϴ�");
		return 0;
		}
	 return pay(cardNo,amount);
	}
	//,����ī�� ����� �ִٸ� ����� �����Ѵ�
	//�Է°�:ī���ȣ,����� ����
	//��ȯ��:����
	
}
