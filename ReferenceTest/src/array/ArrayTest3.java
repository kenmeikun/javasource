package array;

public class ArrayTest3 {

	public static void main(String[] args) {
		//int 타입의 배열 5개 생성
		//0 10 20 30 40 
		int score[]= {0,10,20,30,40};
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]+"\t");
		}

			String lol[]= {"야스오","럼블","제이스","아칼리","티모"};
			/*
			 * for (int i = 0; i < lol.length; i++) { System.out.println(lol[i]+"\t"); }
			 */
			//항상된 for문
			for(String f:lol) {
				System.out.println(f+"\t");
			}
	}//main

}
