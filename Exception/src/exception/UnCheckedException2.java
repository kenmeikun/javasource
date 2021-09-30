package exception;

public class UnCheckedException2 {

	public static void main(String[] args) {
//	String data1="100";
//	String data2="a100";
//	
//	int value1=Integer.parseInt(data1);
//	int value2=Integer.parseInt(data2);
//	System.out.println(value1+value2);
		String data1 = "100";
		String data2 = "200";

		try {
			int value1=Integer.parseInt(data1);
			int value2=Integer.parseInt(data2);
			System.out.println(value1+value2);
		} catch (NumberFormatException e) {

			System.out.println("숫자 변환 불가능.");
		}finally {//exception 여부와 상관없이 무저건 실행
			System.out.println("다시실행하세요");
		}
	}

}
