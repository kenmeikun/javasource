package string;

public class CharAt {

	public static void main(String[] args) {
		String str1 = "�ڹ� ���α׷���";
		char ch = str1.charAt(3);
		System.out.println(ch);
		System.out.println();
		boolean flag=false;
		//str1���̿��� �� ��� ���ڰ������ӤŤ� ��� ������������ ������ ��������
//		for(int i=0;i<str1.length();i++) {
//			if (str1.charAt(i)=="��") {
//				flag=true;
//				break;
//			}
//		}

		String str2 = "HELLO JAVA";
		// str2�� char �迭�� ��� �׹迭�� ���
		char charr[] = new char[str2.length()];

		for (int i = 0; i < str2.length(); i++) {
			charr[i] = str2.charAt(i);
		}
		for (char ch1 : charr) {
			System.out.printf("%C",ch1);
		}
	}

}
