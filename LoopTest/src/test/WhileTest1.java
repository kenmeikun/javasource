package test;

public class WhileTest1 {

	public static void main(String[] args) {
		int i=0;
		while (i<10) {
			//�ݺ��ؾ����۾�
			System.out.println("�ȳ��ϼ���.");
			i++;
		}
		//¦�����ϱ�
		System.out.println();
		i=0;
		while (i<11) {
			System.out.print(i+"\t");
			i+=2;
		}
		/*
		 * for (int i = 0; i < 3; i++) { for (int j = 0; j < 3; j++) {
		 * System.out.print("*"); } System.out.println(); }
		 */
		System.out.println();
		i=3;
		while (i<13) {
			System.out.print(i+"\t");
			i+=3;
		}
		
		//1~100������
		/*
		 * int sum=0;i=1; for (int i = 0; i <=100; i++) { sum=sum+i; }
		 * System.out.println("1~100������:"+sum);
		 */
		System.out.println();
		int sum=0;i=1;
		while (i<101) {
			sum=sum+i;
			i++;
		}
		System.out.println("1~100������:"+sum);
	}//main

}
