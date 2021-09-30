package abstractTest;

public class AiCarEx {

	public static void main(String[] args) {
		AiCar ai =new AiCar("black");
		
		ai.start();
		ai.drive();
		ai.stop();

			//추상클래스는 객체생성불가
		//
		Car car =new AiCar("white");
		car.start();
		car.drive();
		car.stop();
	}

}
