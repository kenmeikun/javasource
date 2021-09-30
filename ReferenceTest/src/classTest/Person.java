package classTest;

//final: 수정이 불가하다 
//final 이사용되는곳: 클래스,메서드,.맴버변수,지역변수
//클래스: 상속불가
//메소드 :오버라이딩 불가
//맴버변수,지역번수:수정불가
public class Person {
  final String nation="korea";
  final String ssn;	//초기화를 무저건 해야한다
  String name;
  
public Person(String ssn, String name) {
	super();
	this.ssn = ssn;
	this.name = name;
}
  
	
}
