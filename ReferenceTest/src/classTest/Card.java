package classTest;

public class Card {
	//맴버변수라고부른다
	//객체생성
		String kind;//모양
		int number;
		
//		int width=10;
//		int height=7;
		//static :클레스에 고정된 맴버
		//			객채를사용하지않고 사용
		//	     	클래스가 메모리에 로드될때 생성
		//클래스 변수라고부름
		static int width=10;
		static int height=7;
		
		public Card(String kind, int number) {
			super();
			this.kind = kind;
			this.number = number;
		}

		public String getKind() {
			return kind;
		}

		public void setKind(String kind) {
			this.kind = kind;
		}

		public int getNumber() {
			return number;
		}
		//static (정적)메쏘드:객체를 사용하지 않고 사용	
		// 					클래스가 메모리에 로드될 때 생성
		//					static 메써드 안에서 인스턴스 맴버 사용 불가

		public void setNumber(int number) {
			this.number = number;
		}

		public static int getWidth() {
			//getnumber()(x)
			//getHeight();(o)
			return width;
		}

		public static void setWidth(int width) {
			Card.width = width;
		}

		public static int getHeight() {
			return height;
		}

		public static void setHeight(int height) {
			Card.height = height;
		}
		
		
		
}
