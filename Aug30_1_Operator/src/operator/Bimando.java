package operator;

import java.util.Scanner;

public class Bimando {

	public static void main(String[] args) {
		//비만도 검사---
		//이름: 
		//키:
		//몸무게:
		//---------------
		//표준체중:xx.xxkg
		//비만도 :yy.yy%
		///ZZZ씨는 비만
		
		//소수점 2자리까지만
		//표준체중=(키- 100)*0.9
		//비만도=(몸무게/표준체중)*100
		//비만도 120초과하면 비만,아니면정상
		 Scanner k =new Scanner(System.in);	
		 System.out.println("비만도 검사---");
		 System.out.println("이름:");
		 String name=k.next();
		 System.out.println("키:");
		 double hei=k.nextDouble();
		 System.out.println("몸무게:");
		 double wei=k.nextDouble();
		 System.out.println("------");
		 double avewei=(hei-100)*0.9;
		 double biman=(wei/avewei)*100;
		 String areyou=(biman>=120)?"비만":"정상";
		// System.out.printf("표준체중 : %.2fkg\n",wei);
		//System.out.printf("비만도 : %.2fkg\n",biman);	
		//System.out.printf("%s씨는 : %s\n",name,areyou);
		 System.out.println("표준체중:"+(Math.round(wei*100)/100.00)+"kg");
		 System.out.println("비만도:"+(String.format("%.2f",biman))+"kg");
		 System.out.println(name+"씨는"+areyou+"입니다.");
	}

}
