package classTest;

public class DataEx {

	public static void main(String[] args) {
	Data data =new Data();
	System.out.println("data "+data);
	//x의값 15로 지정
//	data.x=10;
//	change(data.x);
//	System.out.println("after change()x="+data.x);
	System.out.println();
	change(data);
	System.out.println("after change()x="+data.x);
	System.out.println();
	
	change(data);
	}
	static void change(int x) {
		x=10000;
		System.out.println("change()x="+x);
	}
	static void change(Data d) {
		System.out.println("Data d "+   d);
		
		d.x=10000;
	}
}
