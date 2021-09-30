package classTest;

public class MyMath {
	// 맴버 변수
	long a;
	long b;

	long add() {//입력값없음
		return a + b;
	}

	long subtract() {
		return a - b;
	}

	long multiply() {
		return a * b;
	}

	double divide() {
		return a / b;
	}
	///////
	static long add(long a,long b) {//입력값있음
		return a + b;
	}

	static long subtract(long a,long b) {
		return a - b;
	}

	static long multiply(long a,long b) {
		return a * b;
	}

	static double divide(double a,double b) {
		return a / b;
	}
}
