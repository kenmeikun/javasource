package math;

public class MathEx2 {

	public static void main(String[] args) {
		Math.random(); //0<-math.random()<1
		//�� ���� �������� ���ϱ� (1~3����)
		// 2 1 1
		// 1 2 3
		// 3 2 1
		// 1 1 1
		while (true) {
			int num1 = (int)(Math.random()*3)+1;
			int num2 = (int)(Math.random()*3)+1;
			int num3 = (int)(Math.random()*3)+1;
			
			System.out.println(num1+"/"+num2+"/"+num3);
			if (num1==num2&&num1==num3) {
				break;
			}
		}
		
	}//main

}
