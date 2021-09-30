package test;

public class ForTest1 {

	public static void main(String[] args) {
		//;
		/*
		 * int a =3; int b =4; int c =5;
		 */
		//for실행순서
		//1 int i=0;
		//2 i<10;
		//①
		for (int i = 0; i <10; i++) {
			// 3반복해야할작업
			System.out.println("안뇽하세여");
		}
		System.out.println();
		//1~10 까지출력
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
		}
		System.out.println();
		
		//i=i+1;=>i++;
		//i=i+2 =>i+=2;
		
		//0~10까지 짝수만
		for (int i = 0; i <=10; i+=2) {
			System.out.println(i+"\t");
		}
		System.out.println();
		//3의 배수만 출력
		for (int i = 0; i <=30; i+=3) {
			System.out.println(i+"\t");
		}
	}//main

}
