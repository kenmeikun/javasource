package operator;

import java.util.Scanner;

public class LastWeekMain {
// �����տ�����
	// && & 	|| | 			!		^
	// ��/and	�ų�/or		�ݴ�/not  	xor
	//xor(exclusive or) - ��Ÿ�� or
	//����ó�����
	// 2��¥�� : �ߴܵǴ� ���� -v
	//	&&- �� Ȯ�� �����Ÿ� ������ ��ġ
	//	||- �� Ȯ�� �����Ÿ� ������ ��ġ
	// 1��¥�� : ������ ���� ����
	
	
	public static void main(String[] args) {
		
 System.out.println("---������ �ù�---");
  Scanner k = new Scanner(System.in);
  System.out.println("����:");
  double x =k.nextDouble();
  System.out.println("����:");
  double y =k.nextDouble();
  System.out.println("����:");
  double h =k.nextDouble();
  System.out.println("����:");
  double w =k.nextDouble();
  System.out.println("------------");
  
  double v =x * y * h;
  System.out.printf("����:%.1f\n",v); 
  System.out.printf("����:%.1f\n",w);
  //���ǰ� 10�̻��̰�, ���԰� 1000�̻��̸�
  boolean a = (w>=1000)&&(v>=10);
 // boolean a = (v>=10)&&(w>=1000); �տ� ���ɼ��������ɳ���
  System.out.println(a);
  
  //���ǰ� 10�̸��̰ų�,���԰� 1000�̸��̸�
   boolean b=(v<10)||(w<1000);
   System.out.println(b);
   
   //���԰� 20�̻��̰�, ���԰� 30 �̻��̸�
   boolean c =(w>=20) && (w>=30);
   System.out.println(c);
// ���ǰ� 10�̸��̵���,���԰� 1000�̸��̵��� �ϳ��� 
	boolean d=(v<10)^(w<1000);  
	System.out.println(d);
	
	
	}

}
