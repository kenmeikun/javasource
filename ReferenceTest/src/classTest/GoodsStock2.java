package classTest;

public class GoodsStock2 {
	// �Ӽ�:��ǰ�ڵ�(p123450),������
	private String code;
	private int stock;
	// ��� ������� ����(�Է°� ����,�� ��,)
	// ������ ����(�̷°� ����,���簪��)

	// �⺻������
	GoodsStock2() {

	}
	//������ �����ε�
	//�ɹ����� �ʱ�ȭ ����
	GoodsStock2(String code,int stock) {
		this.code=code;
		this.stock=stock;
	}
	

	void addstock(int amount) {
		stock += amount;
	}

	int downstock(int amount) {
		if (stock > amount) {
			stock -= amount;
		}
		return stock;
	}
	
	//���� �������� �����ϴ� �޼���
	int getStockNum() {
		return stock;
	}
	
}
