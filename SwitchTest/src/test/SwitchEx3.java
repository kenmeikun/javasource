package test;

import java.util.Scanner;

public class SwitchEx3 {

	public static void main(String[] args) {
		//�������Է¹ޱ�
		
		Scanner K= new Scanner(System.in);
		
		System.out.println("����:");
		String position = K.next();
		
		//String position = "����";

		// position ���� 700����,���� 500����, ������ 300����
		switch (position) {
		case "����":
			System.out.println("700����");
			break;
		case "����":
			System.out.println("700����");
			break;
		default:
			System.out.println("300����");
			break;
		}
	}

}
