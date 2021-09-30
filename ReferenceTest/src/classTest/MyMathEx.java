package classTest;

public class MyMathEx {

	public static void main(String[] args) {
		//static 메서드(클래스 메소드)호출
		System.out.println("----------정적메서드로 호출시");
		System.out.println(MyMath.add(200l, 100l));
		System.out.println(MyMath.subtract(200l, 100l));
		System.out.println(MyMath.multiply(200l, 100l));
		System.out.println(MyMath.divide(200.0, 100.0));
		// 맴버 메소드 호출 
		System.out.println("---------멤버 메소드 호출 시");
		MyMath mymath =new MyMath();
		mymath.a=100l;
		mymath.b=200l;
	System.out.println(mymath.add());	
	System.out.println(mymath.subtract());
	System.out.println(mymath.multiply());
	System.out.println(mymath.divide());
		
		
		
	}
	
	
}
