package array;

public class ArrayTest3 {

	public static void main(String[] args) {
		//int Ÿ���� �迭 5�� ����
		//0 10 20 30 40 
		int score[]= {0,10,20,30,40};
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]+"\t");
		}

			String lol[]= {"�߽���","����","���̽�","��Į��","Ƽ��"};
			/*
			 * for (int i = 0; i < lol.length; i++) { System.out.println(lol[i]+"\t"); }
			 */
			//�׻�� for��
			for(String f:lol) {
				System.out.println(f+"\t");
			}
	}//main

}
