package inheritance;

import java.util.Scanner;

public class ChekingAccount extends Account2 {
	// ���¹�ȣ,������,�ܾ� =>�θ�
	// �Ա��ϴ�,����ϴ� =>�θ�
//	
//	ī���ȣ(111-11-1234)
//	ī�尪�� �����Ѵ�
//	

	private String cardNo;

	public ChekingAccount(String num, int money, String name, String cardNo) {
		super(num, money, name);
		this.cardNo = cardNo;
	}

	int pay(String cardNo, int amount) {
		// �ܾ�=���� �ܾ�-ī�����
		if (!cardNo.equals(this.cardNo) || getMoney() < amount) {
			System.err.println("ī���ȣ�� ���ݾ��� Ȯ�����ּ���.");
			return 0;
		}
		// setmoney(getMoney() - amount);
		// �θ��� output�̶� ����
		return output(amount);
	}

//ī�尪�� �����Ѵ� 
//�Է°� :ī���ȣ ,���ݾ� 
//��ȯ�� : ����int 
//ī�尪�� �����Ѵ�.(�Ѿ�� ī���ȣ�� ���� �߱޵� ī���ȣ�� ������, 
//���ݾ��� ���� �ܾ׺��� ������ Ȯ��

}
