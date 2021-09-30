package array;

public class ArrayTest7 {

	public static void main(String[] args) {
		//
		int score[]= {78,65,95,88,36,45,25,47,87};
		int max=score[0];//최고점수
		int min=score[0];//최저점수
		for (int i = 1; i < score.length; i++) {
			if (max<score[i]) {
				max=score[i];
			}else if (score[i]<min) {
				min=score[i];
			}
		}
		System.out.println("최고점수:"+max);
		System.out.println("최저점수:"+min);
	}//main

}
