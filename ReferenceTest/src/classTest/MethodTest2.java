	package classTest;



/*리턴타입이 메소드먕(*****){
 * 
리턴타입이 void 인 것을 제외한다면
무저건 return 키워드가 들어와야 함


*/
public class MethodTest2 {
	
	//두개의 숫자를 받아서 더한결과보내기
	int sum(int num1,int num2) {
			int result=num1+num2;
			return result;
	}
	
	void println99() {
		for (int i = 2; i <10; i++) {
		for (int j = 1; j < 10; j++) {
			System.out.printf("%d*%d=%d\n",i,j,i*j);
		}	
		}
	}
}//class
