package classTest;

public class CircleEx {

	public static void main(String[] args) {
		Circle circle =new Circle();
		circle.radius=7;
		System.out.println("면적:"+circle.result());
		
		
		Circle circle2 =new Circle();
		circle2.radius=15;
		System.out.println("면적:"+circle2.result());
	}

}
