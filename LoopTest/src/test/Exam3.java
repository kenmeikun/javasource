package test;

import java.io.IOException;
import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) throws IOException {
		boolean run=true;
		//�ܾ�
		int balance=0;
		int keyCode=0;
		int input=0;
		Scanner sc=new Scanner(System.in);
		while (run) {
			if (keyCode!=13&&keyCode != 10) {
				System.out.println("**********************");
				System.out.println("1. ����2. ��� 3.�ܰ� 4.����");
				System.out.println("**********************");
				System.out.println("����>>>>");
			}
			keyCode=System.in.read();
			//1���ÿ����Է¹ް� �ܾ��߰�
			//2.��ݾ� �Է¹ް� �ܾ�����
			//3. �ܾ����
			//4.��������
			if (keyCode==49) {
				System.out.println("�Ա��ұݾ�:");
				input=sc.nextInt();
				balance+=input;
			}else if (keyCode==50) {
				System.out.println("����ұݾ�:");
				input=sc.nextInt();
				if (input>balance) {
					System.err.println("�ݾ��̺����Ͽ� ����� �Ұ����մϴ�.");
				}else {
					balance-=input;
				}					
			}else if (keyCode==51) {
				System.out.println("�����ܰ�:"+balance);
			}else if (keyCode==52) {
				run=false;
			}
		}
		System.out.println("���α׷� ����");
	}//

}
