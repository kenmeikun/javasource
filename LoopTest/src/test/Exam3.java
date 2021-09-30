package test;

import java.io.IOException;
import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) throws IOException {
		boolean run=true;
		//잔액
		int balance=0;
		int keyCode=0;
		int input=0;
		Scanner sc=new Scanner(System.in);
		while (run) {
			if (keyCode!=13&&keyCode != 10) {
				System.out.println("**********************");
				System.out.println("1. 예금2. 출금 3.잔고 4.종료");
				System.out.println("**********************");
				System.out.println("선택>>>>");
			}
			keyCode=System.in.read();
			//1선택예금입력받고 잔액추가
			//2.출금액 입력받고 잔액차감
			//3. 잔액출력
			//4.나가가ㅣ
			if (keyCode==49) {
				System.out.println("입금할금액:");
				input=sc.nextInt();
				balance+=input;
			}else if (keyCode==50) {
				System.out.println("출금할금액:");
				input=sc.nextInt();
				if (input>balance) {
					System.err.println("금액이부족하여 출금이 불가능합니다.");
				}else {
					balance-=input;
				}					
			}else if (keyCode==51) {
				System.out.println("현재잔고:"+balance);
			}else if (keyCode==52) {
				run=false;
			}
		}
		System.out.println("프로그램 종료");
	}//

}
