package string;

public class CharAt {

	public static void main(String[] args) {
		String str1 = "자바 프로그레밍";
		char ch = str1.charAt(3);
		System.out.println(ch);
		System.out.println();
		boolean flag=false;
		//str1을이용해 그 라는 문자가있으머ㅕㄴ 출력 있으먀포함중 없으먄 미퍼함중
//		for(int i=0;i<str1.length();i++) {
//			if (str1.charAt(i)=="그") {
//				flag=true;
//				break;
//			}
//		}

		String str2 = "HELLO JAVA";
		// str2를 char 배열에 담고 그배열을 출력
		char charr[] = new char[str2.length()];

		for (int i = 0; i < str2.length(); i++) {
			charr[i] = str2.charAt(i);
		}
		for (char ch1 : charr) {
			System.out.printf("%C",ch1);
		}
	}

}
