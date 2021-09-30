package inheritance;
// 확장
// extends 부모클래스 명
// 생성자와 초기화 블럭은 상속되지 않습니다.	
// private 맴버변수는 접근이 제한됨
// 
public class Child extends Parent {

	public Child(int age) {
		super(age);//parent int 를 받는 생성자 호출
	
	}
	
	void play() {
		System.out.println("놀자!!!");
	}
	@Override
	public void print() {
		System.out.println("안녕");
	}
		
}
