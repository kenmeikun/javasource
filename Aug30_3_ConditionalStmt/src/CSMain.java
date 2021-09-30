import java.util.Scanner;

public class CSMain {
//조건문
//반복문
//컬렉션
//특징
	// 마트

	// 가격:
	// ------------
	// xxxx원어치 구매함
	// 적립 포인트:
	// 10000원이상 구매시 보너스 포인트 50점 더
	// 1%
	// 흐름 제어
	// 조건문:특정 조건때만 흐름이 넘어오도록 if switch
	// 반복문
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println("마트");

		System.out.println("가격:");
		int price = k.nextInt();
		System.out.println("------------");
		System.out.printf("%d원어치 구매\n", price);
		System.out.println(price + "원어치구매함");
		int point = price / 100;
		if (price >= 10000) {
			point += 50;
		}
		//다이소
		//2만원<가격<5만원
		//포인트 100점 더 추가 ,아니면 10점 추가
		if (price >=20000 && price<=50000) {
			point +=100;
		}else {
			point+=10;
		}
		// double point=price*.01;
		System.out.printf("적립포인트:%d\n", point);
		System.out.println("적립포인트:" + point);
	}

}
