package test;

public class TypeTest1 {

	public static void main(String[] args) {
		//Ÿ��-1)�⺻Ÿ�� 2)����Ÿ��
		//������ �޸𸮰� ���Ǵ� ����� �޶���
		
		//�⺻Ÿ�� �⺻Ÿ���� null�Ұ�
		int age=25;
		double price=200.3;
		//����Ÿ��
		//���ڿ� ����
		String name="java";
		String name2=new String("java");
		String hobby=null;
		//���� ==,!=,eqauls()
		System.out.println(name==name2?"��":"�ٸ�");
		System.out.println(name.equals(name2)?"��":"�ٸ�");
		System.out.println(hobby);//������������ �Ҵ�x
	}//mai

}//cl
