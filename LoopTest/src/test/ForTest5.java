package test;

public class ForTest5 {

	public static void main(String[] args) {
		// **********
		// **********
		// **********
		// **********
		// **********
		// 이중for 실행 순서
		//1.int i=0;
		//2.i<3
		//3.안쪽 for 문의 int j=0;
		//4.j<3;
		//5. System.out.print("*");
		//6.j++
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int j = 1; j <1; j++) {
			System.out.print("*");
		}System.out.println();
		for (int j = 1; j <2; j++) {
			System.out.print("*");
		}System.out.println();
		
		System.out.println();
		for(int i=1 ; i<=5 ; ++i) {
			//j를 찍기위한 내부 for문
			for(int j=1 ; j<=i ; ++j) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
