package test;

public class ForTest2 {

	public static void main(String[] args) {
		//1~10까지합
		int sum=0;
		for (int i = 0; i <=10; i++) {
			sum = sum+i;
		}
		System.out.println(sum);
		
		System.out.println();
		 sum=0;
		//1~100까지합
		for (int i = 0; i <=100; i++) {
			sum=sum+i;
		}
		System.out.println("1~100까지합:"+sum);
	}//main

}//class
