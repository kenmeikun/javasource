
public class ShiftOperatorMain {
	// 24�ð�=1<<0 :1
	// ����=1<<1 :2
	// ����=1<<2 :4
	// ��������=1<<3 :8
	// ���1<<4 :16
	
	//���� ctrl(����)+f11
	//�����:f11
	public static void main(String[] args) {
		int value = 20;
		//break����Ʈ
		//�迭,�÷���
		if (value >= 16) {
			System.out.println("���");
			value -= 16;
		}
		if (value >= 8) {
			System.out.println("��������");
			value -= 8;
		}
		if (value >= 4) {
			System.out.println("����");
			value -= 4;
		}
		if (value >= 2) {
			System.out.println("����");
			value -= 2;
		}
		if (value >= 1) {
			System.out.println("24�ð�");
			value -= 1;
		}
		System.out.println(value);
	}

}
