package string;

public class StringObject1 {

	public static void main(String[] args) {
		//축약방법
		String str1="안녕하세여";
		//정식방법
		String str2= new String("안녕하세여");
		char[] value= {'a','b','c','d','e'};
		//String str3=new String(char[] value);
		String str3=new String(value);
	}

}
