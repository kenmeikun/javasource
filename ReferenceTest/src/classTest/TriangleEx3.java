package classTest;

public class TriangleEx3 {

	public static void main(String[] args) {
		//���̰� �ٸ� �ﰢ��5���� �������ִ�
		
		Triangle3 triArr[]=new Triangle3[5];
		triArr[0] =new Triangle3(3, 5);
		triArr[1] =new Triangle3(2, 7);
		triArr[2] =new Triangle3(14, 3);
		triArr[3] =new Triangle3(7, 6);
		triArr[4] =new Triangle3(8, 4);
		triArr(triArr);
		
	}
	static void triArr(Triangle3 triArr[]) {
		//�������ϱ�
		for (int i = 0; i < triArr.length; i++) {
			System.out.println("����"+triArr[i].getArea());
			
		}
	}

}
