package test;

import java.util.Scanner;

public class SwitchEx6 {

	public static void main(String[] args) {
		// ����(1),����(2),��(3)

		// ����-��ǻ��
		// ����1~3 �ڵ����� ����=>3

		// ���� ���� �κ�-�Է�=>2
		// ����� �ʸ���������
		System.out.println("----����������----");
		Scanner K = new Scanner(System.in);
		int com = (int) (Math.random() * 3) + 1;
		System.out.println("����(1),����(2),��(3)���ϳ����Է�");
		int me = K.nextInt();
		System.out.println("--------------------------");
		for (int i = 3; i >= 1; i--) {
			System.out.println(i + "!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		System.out.println("��������:" + me);
		System.out.println("�����̳���:" + com);
		switch (me - com) {
		case 0:
			System.out.println("�����ϴ�.");
			break;
		case 1:
		case -2:
			System.out.println("�̰���ϴ�.");
			break;
		case 2:
		case -1:
			System.err.println("�����ϴ�.");
			break;
		}
	}

}
