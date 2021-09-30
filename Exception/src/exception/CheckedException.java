package exception;


//exception예외사항
//checkedException:compile 시 나타나는 예외
//uncheckedException:run타임시 나타나는 예외
public class CheckedException {

	public static void main(String[] args) {
		//ClassNotFoundException
		try {
			Class.forName("java.long.String");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
