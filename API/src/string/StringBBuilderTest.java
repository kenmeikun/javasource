package string;


public class StringBBuilderTest {

	public static void main(String[] args) {
//		String data="ABC";
//		data+="DEF";
		//기존문자열을 제거한후 새롭게 문쟈열생성 =>StringBuffer,StringBuilder 개선
		StringBuilder builder =new StringBuilder();
		
		//추가
		builder.append("ABC");
		builder.append("DEF");
		System.out.println(builder);
		
		//삽입
		builder.insert(3,"34");
		System.out.println(builder);
		
		//삭제
		builder.delete(1,3);
		System.out.println(builder);
		
		String str1="java programming";
		StringBuilder builder1=new StringBuilder(str1);
		builder1.append("ss");
		
	}

}
