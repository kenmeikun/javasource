package classTest;

public class MyMathEx {

	public static void main(String[] args) {
		//static �޼���(Ŭ���� �޼ҵ�)ȣ��
		System.out.println("----------�����޼���� ȣ���");
		System.out.println(MyMath.add(200l, 100l));
		System.out.println(MyMath.subtract(200l, 100l));
		System.out.println(MyMath.multiply(200l, 100l));
		System.out.println(MyMath.divide(200.0, 100.0));
		// �ɹ� �޼ҵ� ȣ�� 
		System.out.println("---------��� �޼ҵ� ȣ�� ��");
		MyMath mymath =new MyMath();
		mymath.a=100l;
		mymath.b=200l;
	System.out.println(mymath.add());	
	System.out.println(mymath.subtract());
	System.out.println(mymath.multiply());
	System.out.println(mymath.divide());
		
		
		
	}
	
	
}
