package inheritance;

public class CreditLineAccount extends Account2 {
	private int creditLine;//���̳ʽ� �ѵ�
	public CreditLineAccount(String num, int money, String name,int creditLine) {
		super(num, money, name);
		this.creditLine=creditLine;
	}
//���¹�ȣ,������,�ܾ�,���̳ʽ��ѵ�/ �Ա��ϴ�,����ϴ�
	
//����ϴ� �������̵�
//�θ��� ��� : �ܾ�=�ܾ�-��ݾ�
//�ڽ�:�ܾ�(�����ܾ�+���̳ʽ� �ѵ�)
	@Override
	int output(int amount) {
		//�����ܾ�+���̳ʽ��ѵ��ʵ庸�� ���ݾ��� ������ ����Ұ� �޼��� ���,0�� ���� 
		if (amount>getMoney()+creditLine ) {
			System.out.println("���ݾ� �ѵ� �ʰ�.");
			return 0;
		}
		setmoney(getMoney()-amount);
		//�ܾ�(�����ܾ�+���̳ʽ� �ѵ�)-��ݾ�
		return getMoney();
	}
	
}
