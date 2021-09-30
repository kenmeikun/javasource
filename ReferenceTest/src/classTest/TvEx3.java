package classTest;

public class TvEx3 {

	public static void main(String[] args) {
		//tv3 객체를 3개만들고 싶다
//		TV3 tv1=new TV3();
//		TV3 tv2=new TV3();
//		TV3 tv3=new TV3();
		//=>배열
		TV3 tvArr[] =new TV3[3]; //int arr[]=new int[3];
		
		tvArr[0]=new TV3("빨강",true,5);
		tvArr[1]=new TV3("검정",false,6);
		tvArr[2]=new TV3("흰색",true,2);
		printArr(tvArr);
	}
	static void printArr(TV3 tvArr[]) {
		//tvArr에 들어있는 객체의 내용을 출력
		for (int i = 0; i < tvArr.length; i++) {
			System.out.print("티비색상"+tvArr[i].getColor());
			System.out.print("티비전원"+tvArr[i].isPower());
			System.out.println("티비채널"+tvArr[i].getChannel());
			System.out.println();
			
		}
	}
}
