package test;

import java.util.Scanner;

public class ForTest4 {

	public static void main(String[] args) {
		//사용자한테 구구단의 단수를 입력받기 구구단
		Scanner k= new Scanner(System.in);
		System.out.println("몇단을입력받으시겠습니까?:");
		int input=k.nextInt(); 
		 for(int i=1;i<10;i++) {
			 //System.out.println(input+"*"+i+"="+(input*i));
			 System.out.printf("%d*%d=%d\n",input,i,(input*i));
		 }

	}

}
