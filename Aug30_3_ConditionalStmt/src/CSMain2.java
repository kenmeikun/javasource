import java.util.Scanner;

public class CSMain2 {

	public static void main(String[] args) {
		// �߰����:
		// �⸻���:
		// ---------------
		// ���:

		// ����� �Ҽ��� ���ڸ���
		// ������� 90�̻� ��
		// �� �ص�80�̻��̸� �����������ض�

		// ����>=90 ��
		// 80~90��
		// 70~80��
		// 60~70��
		// ���� <60 ��
		//if(a){������������
		//}else if{b){
		//a�¶� ,b�� ������������
		//....}ELSE{ ������}
		Scanner k = new Scanner(System.in);
		System.out.println("�߰����:");
		double mid = k.nextDouble();
		System.out.println("�⸻���:");
		double last = k.nextDouble();
		System.out.println("--------");
		double avg = (mid + last) / 2;
		System.out.printf("���:%.1f\n", avg);
		
		if (avg >= 90) {
			System.out.println("��");
		}else if (avg>=80) {
			System.out.println("��");
		}else if (avg>=70) {
			System.out.println("��");
		}else if (avg>=60) {
			System.out.println("��");
		}else {
			System.out.println(" ��");
		}
		
		if (avg >= 90) {
			System.out.println("��");
		} else {
			if (avg >= 80) {
				System.out.println("��");
			}else {
				if (avg>=70) {
					System.out.println("��");
				}
			}

		}
	}

}
