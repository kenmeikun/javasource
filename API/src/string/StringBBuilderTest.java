package string;


public class StringBBuilderTest {

	public static void main(String[] args) {
//		String data="ABC";
//		data+="DEF";
		//�������ڿ��� �������� ���Ӱ� ���𿭻��� =>StringBuffer,StringBuilder ����
		StringBuilder builder =new StringBuilder();
		
		//�߰�
		builder.append("ABC");
		builder.append("DEF");
		System.out.println(builder);
		
		//����
		builder.insert(3,"34");
		System.out.println(builder);
		
		//����
		builder.delete(1,3);
		System.out.println(builder);
		
		String str1="java programming";
		StringBuilder builder1=new StringBuilder(str1);
		builder1.append("ss");
		
	}

}
