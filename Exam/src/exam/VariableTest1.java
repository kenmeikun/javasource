package exam;

//������ ��ȿ����
//�缱��� ��� �������� ��밡��
//�����(����)������ �ݵ�� �ʱ�ȭ �ؾ� ��
public class VariableTest1 {

	//����
			private int num1;
	//�޽��
	public static void main(String[] args) {
		//�޽��
		int num2=0;//�ʱ�ȭ
		if(num2<10) {
			System.out.println(num2);
			int num3=3;
		}
		for(int i=0;i<10;i++) {
			System.out.println(i+" ");
		}
		//System.out.println(i);
		//System.out.println(num3);
	}//main
	
	public void print() {
		System.out.println(num1);
		//System.out.println(num2);
	}

}//class
