package test;

import java.util.Scanner;

public class SwtichEx5 {

	public static void main(String[] args) {
		//����ڿ��� ���� 2�� �Է¹���
		//�������Էƹ���
		
		//����ġ������ ��� �߷�
		Scanner k=new Scanner(System.in);
		System.out.println("�����Է�:");
		double fir=k.nextDouble();
		System.out.println("�������Է�:");
		String uensan=k.next();
		System.out.println("�����Է�:");
		double sec=k.nextDouble();
		//String result;
		switch (uensan) {
		case "+":System.out.println(fir+uensan+sec +"="+(fir+sec));
			//result=fir+uensan+sec;
			break;
		case "-":System.out.println(fir+uensan+sec +"="+ (fir-sec));
		
		break;
		case "*":System.out.println(fir+uensan+sec +"="+(fir*sec));
		
		break;
		case "/":System.out.println(fir+uensan+sec +"="+(fir/sec));
		
		break;
		case "%":System.out.println(fir+uensan+sec +"="+(fir%sec));
		
		break;
		default:System.err.println("+,-,*,/,%�� �����մϴ�.");
			break;
		}
		//System.out.printf("%d %s %d=%d",fir,uensan,sec,result);
	}

}
