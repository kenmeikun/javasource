package test;

import java.util.Scanner;

public class ForTest4 {

	public static void main(String[] args) {
		//��������� �������� �ܼ��� �Է¹ޱ� ������
		Scanner k= new Scanner(System.in);
		System.out.println("������Է¹����ðڽ��ϱ�?:");
		int input=k.nextInt(); 
		 for(int i=1;i<10;i++) {
			 //System.out.println(input+"*"+i+"="+(input*i));
			 System.out.printf("%d*%d=%d\n",input,i,(input*i));
		 }

	}

}
