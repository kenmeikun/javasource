package test;

public class ForTest1 {

	public static void main(String[] args) {
		//;
		/*
		 * int a =3; int b =4; int c =5;
		 */
		//for�������
		//1 int i=0;
		//2 i<10;
		//��
		for (int i = 0; i <10; i++) {
			// 3�ݺ��ؾ����۾�
			System.out.println("�ȴ��ϼ���");
		}
		System.out.println();
		//1~10 �������
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
		}
		System.out.println();
		
		//i=i+1;=>i++;
		//i=i+2 =>i+=2;
		
		//0~10���� ¦����
		for (int i = 0; i <=10; i+=2) {
			System.out.println(i+"\t");
		}
		System.out.println();
		//3�� ����� ���
		for (int i = 0; i <=30; i+=3) {
			System.out.println(i+"\t");
		}
	}//main

}
