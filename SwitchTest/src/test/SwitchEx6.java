package test;

import java.util.Scanner;

public class SwitchEx6 {

	public static void main(String[] args) {
		// 가위(1),바위(2),보(3)

		// 상대방-컴퓨터
		// 랜덤1~3 자동으로 생성=>3

		// 내가 내는 부분-입력=>2
		// 출력은 너를기준으로
		System.out.println("----가위바위보----");
		Scanner K = new Scanner(System.in);
		int com = (int) (Math.random() * 3) + 1;
		System.out.println("가위(1),바위(2),보(3)중하나를입력");
		int me = K.nextInt();
		System.out.println("--------------------------");
		for (int i = 3; i >= 1; i--) {
			System.out.println(i + "!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		System.out.println("내가낸거:" + me);
		System.out.println("상대방이낸거:" + com);
		switch (me - com) {
		case 0:
			System.out.println("비겼습니다.");
			break;
		case 1:
		case -2:
			System.out.println("이겼습니다.");
			break;
		case 2:
		case -1:
			System.err.println("졌습니다.");
			break;
		}
	}

}
