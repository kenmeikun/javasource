package interfaceTest;
	
//1.상수필드만가짐
//2.추상 매소드만 가짐

public interface AdderInterface {
	//
	public static final int X=100;
	
	void method1();
	//1.8 부터
	//static메소드와 default 메소드 들어올 수 있음
	static void method2() {
		
	}
	default void method3() {
		
	}
}
