package classTest;

public class TriangleEx3 {

	public static void main(String[] args) {
		//길이가 다른 삼각형5개를 가지고있다
		
		Triangle3 triArr[]=new Triangle3[5];
		triArr[0] =new Triangle3(3, 5);
		triArr[1] =new Triangle3(2, 7);
		triArr[2] =new Triangle3(14, 3);
		triArr[3] =new Triangle3(7, 6);
		triArr[4] =new Triangle3(8, 4);
		triArr(triArr);
		
	}
	static void triArr(Triangle3 triArr[]) {
		//면적구하기
		for (int i = 0; i < triArr.length; i++) {
			System.out.println("면적"+triArr[i].getArea());
			
		}
	}

}
