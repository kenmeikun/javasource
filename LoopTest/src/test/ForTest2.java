package test;

public class ForTest2 {

	public static void main(String[] args) {
		//1~10������
		int sum=0;
		for (int i = 0; i <=10; i++) {
			sum = sum+i;
		}
		System.out.println(sum);
		
		System.out.println();
		 sum=0;
		//1~100������
		for (int i = 0; i <=100; i++) {
			sum=sum+i;
		}
		System.out.println("1~100������:"+sum);
	}//main

}//class
