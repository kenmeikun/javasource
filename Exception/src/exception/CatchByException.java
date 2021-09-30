package exception;

public class CatchByException {

	public static void main(String[] args) {

		try {

			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			System.out.println(value1 + value2);
			
		}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("입력값을 확인해 주세요");
			
		} catch (NumberFormatException e) {

			System.out.println("숫자 변환 불가능.");
		} finally {// exception 여부와 상관없이 무저건 실행
			System.out.println("다시실행하세요");
		}
	}

}
