package classTest;

public class GoodsStock {
	//�Ӽ�:��ǰ�ڵ�(p123450),������
	 String code;
	 int stock;
	//��� ������� ����(�Է°� ����,�� ��,)
	//������ ����(�̷°� ����,���簪��)
	 
	 
	void addstock(int amount) {
		stock+=amount;
	}
	
	int downstock(int amount) {
		if(stock>amount) {
			 stock-=amount;
		}
		return stock;
	}
}
