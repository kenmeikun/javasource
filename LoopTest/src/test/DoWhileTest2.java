package test;

import java.util.Scanner;

public class DoWhileTest2 {

	public static void main(String[] args) {
		System.out.println("�޼����� �Է��ϼ���?");
		System.out.println("���α׷��� �����Ϸ��� q�� ��������");
		
		Scanner sc= new Scanner(System.in);
		String inputString;
		do {
			System.out.println(">");
			inputString=sc.nextLine();
			System.out.println(inputString);
		} while (!inputString.equals("q"));
		System.out.println("���α׷� ����");
	}//����

}