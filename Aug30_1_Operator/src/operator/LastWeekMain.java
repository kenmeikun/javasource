package operator;

import java.util.Scanner;

public class LastWeekMain {
// 논리결합연산자
	// && & 	|| | 			!		^
	// 고/and	거나/or		반대/not  	xor
	//xor(exclusive or) - 배타적 or
	//정보처리기사
	// 2개짜리 : 중단되는 버전 -v
	//	&&- 더 확률 낮은거를 앞으로 배치
	//	||- 더 확률 높은거를 앞으로 배치
	// 1개짜리 : 끝가지 가는 버전
	
	
	public static void main(String[] args) {
		
 System.out.println("---편의점 택배---");
  Scanner k = new Scanner(System.in);
  System.out.println("가로:");
  double x =k.nextDouble();
  System.out.println("세로:");
  double y =k.nextDouble();
  System.out.println("높이:");
  double h =k.nextDouble();
  System.out.println("무게:");
  double w =k.nextDouble();
  System.out.println("------------");
  
  double v =x * y * h;
  System.out.printf("부피:%.1f\n",v); 
  System.out.printf("무게:%.1f\n",w);
  //부피가 10이상이고, 무게가 1000이상이면
  boolean a = (w>=1000)&&(v>=10);
 // boolean a = (v>=10)&&(w>=1000); 앞에 가능성이적은걸놓자
  System.out.println(a);
  
  //부피가 10미만이거나,무게가 1000미만이면
   boolean b=(v<10)||(w<1000);
   System.out.println(b);
   
   //무게가 20이상이고, 무게가 30 이상이면
   boolean c =(w>=20) && (w>=30);
   System.out.println(c);
// 부피가 10미만이든지,무게가 1000미만이든지 하나만 
	boolean d=(v<10)^(w<1000);  
	System.out.println(d);
	
	
	}

}
