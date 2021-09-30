package array;

public class ArrayTest1 {

	public static void main(String[] args) {
		//int타입의 변수10개생성
		//int a=1 b=2 c=3
		//배열(참조타입)
		//참조타입:힙,null/자동으로초기화
		//정수:0,실수0.0,불린 false
		int arr[]=new int[10];
		//개별 요소에 접근 0번부터시작(0~9)
		System.out.println(arr[0]);
		System.out.println(arr[9]);
		arr[3]=90;
		arr[5]=85;
		arr[7]=65;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println(arr[5]);
		System.out.println(arr[6]);
		System.out.println(arr[7]);
		System.out.println(arr[8]);
		System.out.println(arr[8]);
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println(arr[i]);
		}
	}//main

}
