package math;



//하나의 클래스에  모든 메소드가 static 메소드로 구성되있다면
//import static 만들어서 사용가능
import static java.lang.Math.*;

public class MathEx3 {

	public static void main(String[] args) {
		
		
		double val =90.7552;
		System.out.println("round()"+Math.round(val));
		System.out.println("ceil()"+Math.ceil(1.1));
		System.out.println("floor()"+Math.floor(1.5));
		System.out.println("max()"+Math.max(1.5,1.2));
		System.out.println("min()"+Math.min(1.5,1.2));
		
	}//main

}
