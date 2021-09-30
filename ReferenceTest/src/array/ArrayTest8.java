package array;

public class ArrayTest8 {

	public static void main(String[] args) {
		// 카드 45장(1~45번)
		int card[] = new int[45];
		for (int i = 0; i < card.length; i++) {
			card[i] = i + 1;
		}
		for (int no : card) {
			System.out.println(no + " ");
		}
		System.out.println("-----------------------------------");
		//카드섞기
		for (int i = 0; i < card.length; i++) {
			//바꿀 위치 선정
			int pos=(int)(Math.random()*45);
			
//			for(int j=0 ; j<i ; j++) {
//				//중복이 된 경우 
//				if(card[i] == card[j]) {
//					i--;
//					break;	//반복 중단
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
		
		
	}// 메인

}
