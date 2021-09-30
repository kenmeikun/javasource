package test;

public class BreakTest1 {

	public static void main(String[] args) {
		
		while (true) {
			//주사위를 던져서 6이 나오면 반복문 종료
			int num =(int)(Math.random()*6)+1;
			System.out.println(num);
			if(num==6) {
				break;
			}
		}

	}//main

}
