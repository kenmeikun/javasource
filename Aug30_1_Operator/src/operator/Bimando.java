package operator;

import java.util.Scanner;

public class Bimando {

	public static void main(String[] args) {
		//�񸸵� �˻�---
		//�̸�: 
		//Ű:
		//������:
		//---------------
		//ǥ��ü��:xx.xxkg
		//�񸸵� :yy.yy%
		///ZZZ���� ��
		
		//�Ҽ��� 2�ڸ�������
		//ǥ��ü��=(Ű- 100)*0.9
		//�񸸵�=(������/ǥ��ü��)*100
		//�񸸵� 120�ʰ��ϸ� ��,�ƴϸ�����
		 Scanner k =new Scanner(System.in);	
		 System.out.println("�񸸵� �˻�---");
		 System.out.println("�̸�:");
		 String name=k.next();
		 System.out.println("Ű:");
		 double hei=k.nextDouble();
		 System.out.println("������:");
		 double wei=k.nextDouble();
		 System.out.println("------");
		 double avewei=(hei-100)*0.9;
		 double biman=(wei/avewei)*100;
		 String areyou=(biman>=120)?"��":"����";
		// System.out.printf("ǥ��ü�� : %.2fkg\n",wei);
		//System.out.printf("�񸸵� : %.2fkg\n",biman);	
		//System.out.printf("%s���� : %s\n",name,areyou);
		 System.out.println("ǥ��ü��:"+(Math.round(wei*100)/100.00)+"kg");
		 System.out.println("�񸸵�:"+(String.format("%.2f",biman))+"kg");
		 System.out.println(name+"����"+areyou+"�Դϴ�.");
	}

}
