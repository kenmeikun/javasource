package test;

import java.util.Scanner;

public class DoWhileTest3 {

	public static void main(String[] args) {
	//��ǻ�Ͱ�1~100������ ������ ���Ƿ� ����
	//����ڴ� ��ǻ�Ͱ� ������ �ִ� ���ڰ� �������� �˾Ƹ��߱�
		Scanner sc =new Scanner(System.in);
		//0~99
	int answer=	(int)(Math.random()*100)+1;
int input=0;
do {
	System.out.println("�����Ѽ��ڸ� �Է����ֻ�>>");
	input= sc.nextInt();
	if (input>answer) {
		System.out.println("���� ū���� �Է����ּ���");
	}else {
		System.out.println("���� �������� �Է����ּ���");
	}
} while (input!=answer);
	
	}//main

}
