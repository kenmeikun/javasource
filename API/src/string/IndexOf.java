package string;

public class IndexOf {

	public static void main(String[] args) {
		String str1 ="�ڹ� ���α׷���";
		
		//�Ű������� �־��� ���ڿ��� ���۵� ��ġ�� ����
		int index=str1.indexOf("���α׷���");
		System.out.println(index);
		
		System.out.println("��ã�°��"+str1.indexOf("���̽�"));
		//��ã���� -1
		String str2 ="hello elworld elWsdadaf";
		System.out.println(str2.indexOf(65));
		System.out.println(str2.indexOf('f'));
		System.out.println(str2.indexOf("el",2));
		System.out.println(str2.lastIndexOf("l"));
	}//

}
