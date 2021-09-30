package exception;

// main에서 throws 의 의미:jvm한테 던저지는 의미=>화면출력
public class ThrowEx {
	public static void main(String[] args) {
		
		try {
			findClass();
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}
	}
	
	//throws: 여기서 발생한 예외를 이 메소드를 호출하는 곳으로 던지겠음
 public static void findClass() throws ClassNotFoundException {
	Class.forName("");
	
}

}
	