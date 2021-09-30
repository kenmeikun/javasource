package object;

public class ObjectEx2 {

	public static void main(String[] args) {
		
		Object obj1 =new Object();
		Object obj2 =new Object();
		
		//toString
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		
		//String 사영하는 equals는 오버라이딩 적용
		String str1="홍길동";
		String str2="홍길동";
		System.out.println(str1.toString());
		System.out.println(str2.toString());
		Value value1=new Value(10);
		Value value2=new Value(10);
		//toString()=> 10 값을 추력 오버라이딩
		System.out.println(value1.toString());//object.Value@5d22bbb7
		System.out.println(value2.toString());//object.Value@41a4555e
		
	}//main
		
}
