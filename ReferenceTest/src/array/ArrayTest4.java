package array;

public class ArrayTest4 {

	public static void main(String[] args) {
		int score[]= {78,65,95,88,36,45,25,47,87};
		
		//평균점수내기=합계/개수
		 int sum=0;
			/*
			 * for (int i = 0; i < score.length; i++) { sum = sum+score[i];
			 * 
			 * }
			 */
		 for (int jumsu : score) {
			sum+=jumsu;
		}
System.out.printf("합계:%d,평균:%d",sum,sum/score.length);
	}

}
