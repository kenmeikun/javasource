package test;

public class SwitchEx4 {

	public static void main(String[] args) {
		//8�ø�:����� �մϴ�.
		//9:ȸ�Ǹ� �մϴ�
		//10:������ ���ϴ�
		//������: �ܱ��� �����ϴ�.
		
		//8~11 ������ ���ڰ� �������� �ۼ�
		
		//(int)Math.random()*6=>0~5
		int time = (int)(Math.random()*4)+8;
		System.out.println(time);
		switch (time) {
		case 8:
			System.out.println("���");
			break;
		case 9:
			System.out.println("ȸ��");
			break;
		case 10:
			System.out.println("����");
			break;
			
		default:
			System.out.println("�ܱ�");
			break;
		}
	}

}
