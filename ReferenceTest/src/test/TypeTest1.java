package test;

public class TypeTest1 {

	public static void main(String[] args) {
		//타입-1)기본타입 2)참조타입
		//변수의 메모리가 사용되는 방식이 달라짐
		
		//기본타입 기본타입은 null불가
		int age=25;
		double price=200.3;
		//참조타입
		//문자열 생성
		String name="java";
		String name2=new String("java");
		String hobby=null;
		//값비교 ==,!=,eqauls()
		System.out.println(name==name2?"같":"다름");
		System.out.println(name.equals(name2)?"같":"다름");
		System.out.println(hobby);//아직힙영역에 할당x
	}//mai

}//cl
