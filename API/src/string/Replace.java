package string;

public class Replace {

	public static void main(String[] args) {
		String str1 = "�ڹٴ� ��ü���� ����Դϴ�. �ڹٴ� ǳ���� api�� ������";

		// �ڹ�=>java
		//str1.replace("�ڹ�", "java");
		str1=str1.replaceFirst("�ڹ�", "java");
		System.out.println(str1);
	}

}
