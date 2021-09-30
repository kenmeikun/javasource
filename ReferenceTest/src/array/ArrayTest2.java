package array;

public class ArrayTest2 {

	public static void main(String[] args) {
		//int 타입의 변수10개 선언
		//담을려는타입[배열명]=new 담을려는타입[갯수]
		
		//배열의 선언과 생성
		int scores[]= new int[10];
		
		int arr[]; //선언
		arr =new int[10]; //생성
		//배열의선언과 생성과 초기화
		int arr2[]= {35,95,65,75,25,33};
		System.out.println("배열길이"+arr2.length);
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]+" ");
		}
	}//mai

}//class
