package classTest;

public class TvEx3 {

	public static void main(String[] args) {
		//tv3 ��ü�� 3������� �ʹ�
//		TV3 tv1=new TV3();
//		TV3 tv2=new TV3();
//		TV3 tv3=new TV3();
		//=>�迭
		TV3 tvArr[] =new TV3[3]; //int arr[]=new int[3];
		
		tvArr[0]=new TV3("����",true,5);
		tvArr[1]=new TV3("����",false,6);
		tvArr[2]=new TV3("���",true,2);
		printArr(tvArr);
	}
	static void printArr(TV3 tvArr[]) {
		//tvArr�� ����ִ� ��ü�� ������ ���
		for (int i = 0; i < tvArr.length; i++) {
			System.out.print("Ƽ�����"+tvArr[i].getColor());
			System.out.print("Ƽ������"+tvArr[i].isPower());
			System.out.println("Ƽ��ä��"+tvArr[i].getChannel());
			System.out.println();
			
		}
	}
}
