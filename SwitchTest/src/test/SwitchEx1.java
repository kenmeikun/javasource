package test;

public class SwitchEx1 {
	//switch(int,double,float,char,String,enum){
	// case 값1:해야할일 ;
	//			break;
	// case 값2:해야할일;
	//			break;
	//			default
	//			해야할일:
	//
	//			if~elseif~else 대체하여 사용 가능
	//
	public static void main(String[] args) {
		//주사위
		
		//1~6사이의 수를 자동으로 생성
		int num = (int)(Math.random()*6)+1;
		
		System.out.println(num);
		
		switch (num) {
		case 1:
			System.out.println("1번나옴");
			break;
		case 2:
			System.out.println("2번나옴");
			break;
		case 3:
			System.out.println("3번나옴");
			break;
		case 4:
			System.out.println("4번나옴");
			break;
		case 5:
			System.out.println("5번나옴");
			break;

		default:
			System.out.println("6번나옴");
			break;
		}
		/*
		 * if (num==1) { System.out.println("1번나옴"); }else if (num==2) {
		 * System.out.println("2번나옴"); } else if (num==3) { System.out.println("3번나옴");
		 * } else if (num==4) { System.out.println("4번나옴"); } else if (num==5) {
		 * System.out.println("5번나옴"); } else if (num==6) { System.out.println("6번나옴");
		 * }
		 */
	}

}
