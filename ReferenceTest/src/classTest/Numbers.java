package classTest;

public class Numbers {
	private int num[];

	public Numbers(int[] num) {
		super();
		this.num = num;
	}
	
	//합계 =>반환값은int,입력값은 없으
	//=> 맴버변수 num 배열에 들어있는 값의 합계 리턴
	int getTotal() {
		int sum=0;
		for (int i = 0; i < num.length; i++) {
			sum+=num[i];
		}
		return sum;
	}
	
	//평균 =>반환값은 double,입력값은 없음
	// => 합계 메소드를  이용해서 구한 후 리턴
	double getAverage() {
		// 15/5 => 3=>3.0
		//16.0/5 => 몪=>3.0
		return (double)getTotal()/num.length;
		
	}
	
	
}
