package classTest;

public class GoodsStockEx2 {

	public static void main(String[] args) {
		GoodsStock2 product1 =new GoodsStock2("p12345",30);
		//Ŭ���� �ܺο��� �Ӽ��� ���������ϴ°Ǿȵ�
//		product1.code="p12345";
//		product1.stock=30;
		
		//��ǰ�Ǹ�=>�����
		//ȣ�� =>���ϰ��������� ���ϰ� �ޱ�(syso,����ó��)
		//System.out.println("�������:"+product1.downstock(15));
		//��������
		int stock=product1.downstock(15);
		System.out.println("�������:"+stock);
		//��ǰ=>��� ����
		product1.addstock(5);
		System.out.println("���� ������"+product1.getStockNum());
	}

}
