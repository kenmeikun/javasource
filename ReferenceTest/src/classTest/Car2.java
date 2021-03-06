package classTest;

public class Car2 {

	//속성:제조회사(현대,기아...),모델명(스포티지)...,색상,최대속도	
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	//동작: 전진하다,후진하다
	
	//생성자 -클래스이름과 동일/리턴 타입 없음/중복가능(생성자 오버로딩)
	//목적-필드에 초기값을 저장/객체 생성하면서 준비해야 하는 작업 실행
	Car2(){
		System.out.println("car2기본 생성자");
	}
	Car2(String model){
		System.out.println("car2기본 model초기화");
	}
	Car2(String model,String color){
		System.out.println("car2기본 model,color초기화");
	}	
	 Car2(String company, String model, String color, int maxSpeed) {
		System.out.println("Car2 생성자-속성 모두 초기화");
	}
	 
	//동작-매쏘드
	//리턴타입 메소드명(){}
	//리턴타입 메소드명(){타입 변수명,.......}
	void forward() {
		System.out.println("전진하다");
	}
	void backword() {
		System.out.println("후진하다");
	}
}
