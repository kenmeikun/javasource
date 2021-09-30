package exam;

import java.util.Scanner;

public class Degrees {

	public static void main(String[] args) {
		// 화씨온도=>섭씨온도로 
		
		//조건
		//화씨온도 입력받기 정수
		//받은 화씨온도=>섭씨온도로 변환 후 출력하기
		//(화씨온도-32)*5/9
		Scanner k= new Scanner(System.in);
		System.out.println("화씨온도:");
		double hwa=k.nextDouble();
		double sub=(hwa-32)*5/9.0;
		System.out.printf("섭씨온도:%.2f",sub);

	}

}
