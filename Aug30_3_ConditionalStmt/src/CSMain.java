import java.util.Scanner;

public class CSMain {
//���ǹ�
//�ݺ���
//�÷���
//Ư¡
	// ��Ʈ

	// ����:
	// ------------
	// xxxx����ġ ������
	// ���� ����Ʈ:
	// 10000���̻� ���Ž� ���ʽ� ����Ʈ 50�� ��
	// 1%
	// �帧 ����
	// ���ǹ�:Ư�� ���Ƕ��� �帧�� �Ѿ������ if switch
	// �ݺ���
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println("��Ʈ");

		System.out.println("����:");
		int price = k.nextInt();
		System.out.println("------------");
		System.out.printf("%d����ġ ����\n", price);
		System.out.println(price + "����ġ������");
		int point = price / 100;
		if (price >= 10000) {
			point += 50;
		}
		//���̼�
		//2����<����<5����
		//����Ʈ 100�� �� �߰� ,�ƴϸ� 10�� �߰�
		if (price >=20000 && price<=50000) {
			point +=100;
		}else {
			point+=10;
		}
		// double point=price*.01;
		System.out.printf("��������Ʈ:%d\n", point);
		System.out.println("��������Ʈ:" + point);
	}

}
