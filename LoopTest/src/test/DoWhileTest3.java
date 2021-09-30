package test;

import java.util.Scanner;

public class DoWhileTest3 {

	public static void main(String[] args) {
	//컴퓨터가1~100사이의 정수를 임의로 선정
	//사용자는 컴퓨터가 가지고 있는 숫자가 무엇인지 알아맞추기
		Scanner sc =new Scanner(System.in);
		//0~99
	int answer=	(int)(Math.random()*100)+1;
int input=0;
do {
	System.out.println("에측한숫자를 입력해주삼>>");
	input= sc.nextInt();
	if (input>answer) {
		System.out.println("좀더 큰수를 입력해주세여");
	}else {
		System.out.println("좀더 작은수를 입력해주세여");
	}
} while (input!=answer);
	
	}//main

}
