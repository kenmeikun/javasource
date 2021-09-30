package test;

public class Exam1 {

	public static void main(String[] args) {
		//주사위2개던짐
		//나오는주사위 눈 출력
		
		while (true) {
			int num1 =(int)(Math.random()*6)+1;
			int num2 =(int)(Math.random()*6)+1;
			System.out.println("주사위1:"+num1+"  주사위2:"+num2+"\n");
			//합계5아니면 계속 5면스탑
			if (num1+num2==5) {
				break;
			}
		}
		
	
		
		
	
		
		
	}

}
