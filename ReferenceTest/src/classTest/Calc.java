package classTest;

public class Calc {
	//µ¡»ù
	int plus(int x,int y) {
		return x+y;
	}
	//Æò±Õ
	double avg(int x,int y) {
		//return (x+y)/2;
		//return plus(x,y)/2;
		int sum=plus(x,y);
		return sum/2;
	}
	
	void execute() {
		//Æò±Õ¸Þ¼Òµå È£Ãâ
		double result=avg(7,10);
		println("½ÇÇà°á°ú"+result);
	}
	
	void println(String msg) {
		System.out.println(msg);
	}
}
