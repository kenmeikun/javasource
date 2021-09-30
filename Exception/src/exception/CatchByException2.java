package exception;

public class CatchByException2 {

	public static void main(String[] args) {

		try {

			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			System.out.println(value1 + value2);
			
		}catch (ArrayIndexOutOfBoundsException  | NumberFormatException e) {
				System.out.println("입력값이나 숫자로 변환할수 없습니다.");
			
		} catch (Exception e) {

			System.out.println("알수 없는 예외 발생");
		} finally {// exception 여부와 상관없이 무저건 실행
			System.out.println("다시실행하세요");
		}
	}

}
