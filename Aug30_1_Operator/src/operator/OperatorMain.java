package operator;

import java.util.Scanner;

// << >> <<<(shift����)
	//���߼��ù������� ���	

	//����
	//	����:1
	//	���:2
	//	������:3
	//	����	=1
	//Ư��
	//���Ÿ�:1<<0
	// ����:1<<1
	// ����:1<<2
	//Ư��=(1<<0)+(1<<1)=���Ÿ�+����


	//24�ð�=1<<0	:1
	//����=1<<1 		:2
	//����=1<<2		:4
	//��������=1<<3	:8
	
	//AƯ�� =1->24�ð�
	//BƯ�� =2->����
	//cƯ�� =8->��������
	//dƯ�� =3->1+2->24�ð�+����
	//e	   =6->2+4->����+��	
	//f	   =12->4+8->��+��	
	//g	   =13->24�ð�+��+��

	//��κ� 2�׿���
	//	a>2
	//	1+2
	
	//1��(����)����
	//	!d
	
	//3�׿���
	// ���ǽ� ? 0���� : X����
	
	
public class OperatorMain {

	public static void main(String[] args) {
	 int a =3<<2;
	 System.out.println(a);
	 
	 Scanner k =new Scanner(System.in);	
	 
	 System.out.print("�̸�:");
	 String name=k.next();
	 System.out.print("����: ");
	 int age=k.nextInt();
	 //�̸��� ȫ�浿�̸� ��? ��!!!,�ƴϸ� �������
	// �����ڶ�� �͵��� stack������ ���
	 //String hong="ȫ�浿";
	 //String say2=(name==hong)?"��? ��!!!":"�������"; 
	 
	 String say2=(name.equals("ȫ�浿"))?"��? ��!!!":"�������";
	 
	 System.out.println(say2);
		 
	 //20���� �̻��̸� �ȳ��ϼ���,�ƴϸ� ����
	 //3�׿���
	 	//���ǽ� ? 0����(��) : x����(����)
	  
	  String say=(age>=20)?"�ȳ��ϼ���":"����";
	 System.out.println(say);
	 
	 //���̰� ¦���� ¦,���̰� Ȧ���� Ȧ
	 String oe=(age%2==0)?"¦":"Ȧ";
			 System.out.println(oe);
	
			 
			 
	}

}
