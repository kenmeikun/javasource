package exam;

//변수의 유효범위
//①선언된 블록 내에서만 사용가능
//②로컬(지역)변수는 반드시 초기화 해야 함
public class VariableTest1 {

	//변수
			private int num1;
	//메써드
	public static void main(String[] args) {
		//메써드
		int num2=0;//초기화
		if(num2<10) {
			System.out.println(num2);
			int num3=3;
		}
		for(int i=0;i<10;i++) {
			System.out.println(i+" ");
		}
		//System.out.println(i);
		//System.out.println(num3);
	}//main
	
	public void print() {
		System.out.println(num1);
		//System.out.println(num2);
	}

}//class
