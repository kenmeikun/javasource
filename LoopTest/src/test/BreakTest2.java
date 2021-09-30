package test;

public class BreakTest2 {

	public static void main(String[] args) {
	//숫자를 0에서부터 하나씩 증가시키면서 합계를 구하기
	//단 100넘으면 종료
		int sum=0,i=0;
		while (true) {
			if (sum>=101) {
				break;
			}
			sum+=i;
			i++;
			
		}
		System.out.printf("i=%d,sum=%d",i,sum);
	}//

}
