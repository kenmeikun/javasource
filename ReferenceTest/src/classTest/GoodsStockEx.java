package classTest;

public class GoodsStockEx {

	public static void main(String[] args) {
		GoodsStock product1 =new GoodsStock();
		product1.code="p12345";
		product1.stock=30;
		
		//��ǰ�Ǹ�=>�����
		//ȣ�� =>���ϰ��������� ���ϰ� �ޱ�(syso,����ó��)
		//System.out.println("�������:"+product1.downstock(15));
		//��������
		int stock=product1.downstock(15);
		System.out.println("�������:"+stock);
		//��ǰ=>��� ����
		product1.addstock(5);
		System.out.println("���� ������"+product1.stock);
	}

}
