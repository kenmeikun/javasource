package string;

public class IndexOf {

	public static void main(String[] args) {
		String str1 ="자바 프로그래밍";
		
		//매개값으로 주어진 문자열이 시작된 위치를 리턴
		int index=str1.indexOf("프로그래밍");
		System.out.println(index);
		
		System.out.println("못찾는경우"+str1.indexOf("파이썬"));
		//못찾으면 -1
		String str2 ="hello elworld elWsdadaf";
		System.out.println(str2.indexOf(65));
		System.out.println(str2.indexOf('f'));
		System.out.println(str2.indexOf("el",2));
		System.out.println(str2.lastIndexOf("l"));
	}//

}
