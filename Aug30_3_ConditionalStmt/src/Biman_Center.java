import java.util.Iterator;
import java.util.Scanner;

public class Biman_Center {

	public static void main(String[] args) throws InterruptedException {
		Scanner k = new Scanner(System.in);
		System.out.println("�������������մϴ�");
		System.out.println("�̸�:");
		String name = k.next();
		System.out.println("Ű(cm):");
		double hei = k.nextDouble();
		System.out.println("������(kg):");
		double wei = k.nextDouble();
		System.out.println("--------------------------");
		for (int i = 1; i <4; i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}	
		System.out.println("���ܰ���Դϴ�.");	
		double bmi = wei / ((hei / 100) *(hei / 100) );
		System.out.printf("bmi����:%.2f\n", bmi);
//		if (hei<=30) {
//			System.err.println("Ű�� cm�� ���ּ���");
//		}
		if (bmi >= 35) {
			System.out.println(name+"���� �����Դϴ�.");
		} else if (bmi >= 30) {
			System.out.println(name+"���� �ߵ����Դϴ�.");
		}else if (bmi>=25) {
			System.out.println(name+"���� �浵 ���Դϴ�.");
		}else if(bmi>=23) {
			System.out.println(name+"���� ��ü�� �Դϴ�.");
		}else if(bmi>=18.5) {
			System.out.println(name+"���� ����ü�� �Դϴ�.");
		}else {
			System.out.println(name+"���� ��ü���Դϴ�.");
		}

	}

}
