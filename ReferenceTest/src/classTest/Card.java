package classTest;

public class Card {
	//�ɹ��������θ���
	//��ü����
		String kind;//���
		int number;
		
//		int width=10;
//		int height=7;
		//static :Ŭ������ ������ �ɹ�
		//			��ä����������ʰ� ���
		//	     	Ŭ������ �޸𸮿� �ε�ɶ� ����
		//Ŭ���� �������θ�
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
		//static (����)�޽��:��ü�� ������� �ʰ� ���	
		// 					Ŭ������ �޸𸮿� �ε�� �� ����
		//					static �޽�� �ȿ��� �ν��Ͻ� �ɹ� ��� �Ұ�

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
