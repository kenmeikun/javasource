
public class Price_project {

	public static void main(String[] args) {
		//가격 :34500
		//낸돈 :51000
		//-----------
		//거스름돈:16500
		//1만원:1
		//5천원:1
		//1천원:1
		//5백원:1
		
		int total =34500; //가격
		int input =51000;//낸 금액
		int money= input - total;// 거스름돈 
		System.out.println("가격:"+total);
		System.out.println("낸 금액:"+input);
		System.out.println("거스름 돈:"+money);
		int m10000, m1000, m500, m100, m50 , m10 ,ban;
		m10000= money/10000;
		money=money%10000;
		m1000= money/1000; 
		money= money%1000;
		m500 = money/500;
		money= money%500;
		m100 =money/100;
		money =money%100;
		m50 =money/50;
		money%=50;
		m10=money/10;
		money%=10;
		ban= money>=5?1:0;//나머지금액(방올림)
		
		
		System.out.println("-------------");
		System.out.println("만원짜리"+m10000);
		System.out.println("천원짜리:"+m1000);
		System.out.println("오백원짜리:"+m500);
		System.out.println("백원짜리:"+m100);
		System.out.println("오십원짜리:"+m50);
		System.out.println("십원짜리:"+(m10+ban));
		//System.out.println("나머지(반올림):"+ money);
	}

}
