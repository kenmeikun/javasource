import java.util.Iterator;
import java.util.Scanner;

public class Biman_Center {

	public static void main(String[] args) throws InterruptedException {
		Scanner k = new Scanner(System.in);
		System.out.println("비만진단을시작합니다");
		System.out.println("이름:");
		String name = k.next();
		System.out.println("키(cm):");
		double hei = k.nextDouble();
		System.out.println("몸무게(kg):");
		double wei = k.nextDouble();
		System.out.println("--------------------------");
		for (int i = 1; i <4; i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}	
		System.out.println("진단결과입니다.");	
		double bmi = wei / ((hei / 100) *(hei / 100) );
		System.out.printf("bmi지수:%.2f\n", bmi);
//		if (hei<=30) {
//			System.err.println("키는 cm로 써주세요");
//		}
		if (bmi >= 35) {
			System.out.println(name+"님은 고도비만입니다.");
		} else if (bmi >= 30) {
			System.out.println(name+"님은 중도비만입니다.");
		}else if (bmi>=25) {
			System.out.println(name+"님은 경도 비만입니다.");
		}else if(bmi>=23) {
			System.out.println(name+"님은 과체중 입니다.");
		}else if(bmi>=18.5) {
			System.out.println(name+"님은 정상체중 입니다.");
		}else {
			System.out.println(name+"님은 저체중입니다.");
		}

	}

}
