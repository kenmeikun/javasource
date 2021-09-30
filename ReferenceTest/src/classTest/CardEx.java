package classTest;

public class CardEx {

	public static void main(String[] args) {
		Card card1 =new Card("spade",7);
		cardPrint(card1);
//		card1.number=7;
//		card1.kind="spade";
//		
//		card1.width=18;
//		card1.height=7;
		Card.width=8;
		Card.height=4;
		
		Card card2 =new Card("heart",2);
cardPrint(card2);
		
	}//main
	
	static void cardPrint(Card card) {
		System.out.println("숫자:"+card.getNumber());
		System.out.println("모양:"+card.getKind());
		System.out.printf("카드크기(%d,%d)\n",card.width,card.height);
		System.out.println(	);
	}
}
