package array;

public class ArrayTest8 {

	public static void main(String[] args) {
		// ī�� 45��(1~45��)
		int card[] = new int[45];
		for (int i = 0; i < card.length; i++) {
			card[i] = i + 1;
		}
		for (int no : card) {
			System.out.println(no + " ");
		}
		System.out.println("-----------------------------------");
		//ī�弯��
		for (int i = 0; i < card.length; i++) {
			//�ٲ� ��ġ ����
			int pos=(int)(Math.random()*45);
			
//			for(int j=0 ; j<i ; j++) {
//				//�ߺ��� �� ��� 
//				if(card[i] == card[j]) {
//					i--;
//					break;	//�ݺ� �ߴ�
//				}
//			}
			int temp=card[i];
			card[i]=card[pos];
			card[pos]=temp;
			
		}
		System.out.println();
		for (int no : card) {
			System.out.print(no + " ");
		}
		
		
	}// ����

}
