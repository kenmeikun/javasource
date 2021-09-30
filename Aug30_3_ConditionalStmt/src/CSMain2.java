import java.util.Scanner;

public class CSMain2 {

	public static void main(String[] args) {
		// 중간고사:
		// 기말고사:
		// ---------------
		// 평균:

		// 평균은 소수점 한자리만
		// 평균점수 90이상 수
		// 야 해도80이상이면 다음에는잘해라

		// 점수>=90 수
		// 80~90우
		// 70~80미
		// 60~70양
		// 점수 <60 가
		//if(a){만족시켰으면
		//}else if{b){
		//a는땡 ,b를 만족시켰으면
		//....}ELSE{ 나머지}
		Scanner k = new Scanner(System.in);
		System.out.println("중간고사:");
		double mid = k.nextDouble();
		System.out.println("기말고사:");
		double last = k.nextDouble();
		System.out.println("--------");
		double avg = (mid + last) / 2;
		System.out.printf("평균:%.1f\n", avg);
		
		if (avg >= 90) {
			System.out.println("수");
		}else if (avg>=80) {
			System.out.println("우");
		}else if (avg>=70) {
			System.out.println("미");
		}else if (avg>=60) {
			System.out.println("양");
		}else {
			System.out.println(" 가");
		}
		
		if (avg >= 90) {
			System.out.println("수");
		} else {
			if (avg >= 80) {
				System.out.println("우");
			}else {
				if (avg>=70) {
					System.out.println("미");
				}
			}

		}
	}

}
