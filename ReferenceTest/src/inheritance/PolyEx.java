package inheritance;

public class PolyEx {

	public static void main(String[] args) {
		Parent2 p2 =new Child3();

		p2.field1="";
		p2.method1();
		p2.method2(); //오버라이딩된상태라면 자식 클래스가 메서드 실행
		
		//method3실행
		Child3 c= (Child3)p2;
		c.method3();
		
		
//		Parent2 obj =new Parent2();
//		Child3 c2 =(Child3)obj;
//		c2.method3();
	}

}
