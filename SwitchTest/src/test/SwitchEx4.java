package test;

public class SwitchEx4 {

	public static void main(String[] args) {
		//8시면:출근을 합니다.
		//9:회의를 합니다
		//10:업무를 봅니다
		//나머지: 외근을 나갑니다.
		
		//8~11 사이의 숫자가 나오도록 작성
		
		//(int)Math.random()*6=>0~5
		int time = (int)(Math.random()*4)+8;
		System.out.println(time);
		switch (time) {
		case 8:
			System.out.println("출근");
			break;
		case 9:
			System.out.println("회의");
			break;
		case 10:
			System.out.println("업무");
			break;
			
		default:
			System.out.println("외근");
			break;
		}
	}

}
