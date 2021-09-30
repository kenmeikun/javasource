package classTest;

public class CarEx2 {

	public static void main(String[] args) {
		
		//첫번째 차
		//객체 생성 시 생정자 자동 호출됨
		Car2 car =new Car2();//객체 생성
		//기본 속성값은 String=>null,int=0,boolean=>false,등등
//		car.company="현대";
//		car.model="KONA";
//		car.color="red";
//		car.maxSpeed=200;
		
		car.forward();
		
		//두번째 차
		//객체 생성 시 생정자 자동 호출됨
		Car2 car2= new Car2("kona");
		//세번째 차
		Car2 car3= new Car2("kona","black");
		Car2 car4= new Car2("현대","kona","black",250);
//		car2.company="현대";
//		car2.model="산타페";
//		car2.color="black";
//		car2.maxSpeed=250;
//		
		car2.forward();
		
	}

}
