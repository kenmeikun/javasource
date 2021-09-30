package test;

import java.util.Scanner;

public class SwtichEx5 {

	public static void main(String[] args) {
		//사용자에게 숫자 2개 입력받음
		//연산자입렵받음
		
		//스위치연산후 결과 추력
		Scanner k=new Scanner(System.in);
		System.out.println("숫자입력:");
		double fir=k.nextDouble();
		System.out.println("연산자입력:");
		String uensan=k.next();
		System.out.println("숫자입력:");
		double sec=k.nextDouble();
		//String result;
		switch (uensan) {
		case "+":System.out.println(fir+uensan+sec +"="+(fir+sec));
			//result=fir+uensan+sec;
			break;
		case "-":System.out.println(fir+uensan+sec +"="+ (fir-sec));
		
		break;
		case "*":System.out.println(fir+uensan+sec +"="+(fir*sec));
		
		break;
		case "/":System.out.println(fir+uensan+sec +"="+(fir/sec));
		
		break;
		case "%":System.out.println(fir+uensan+sec +"="+(fir%sec));
		
		break;
		default:System.err.println("+,-,*,/,%만 가능합니다.");
			break;
		}
		//System.out.printf("%d %s %d=%d",fir,uensan,sec,result);
	}

}
