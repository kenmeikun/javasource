package test;

public class SwitchEx2 {

	public static void main(String[] args) {
		char grade='B';
			//A or  B =>����п�
			//B or	b =>�Ϲ�ȸ��
			//�ƹ��͵� ���� =>�մ�
		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("���ȸ��");
			break;
		case 'B':
		case 'b':
			System.out.println("�Ϲ�ȸ��");
			break;	
		default:
			System.out.println("�մ�");
			break;//��������
		}
		
		System.out.println();
		//if else������
		if (grade=='a'||grade=='A') {
			System.out.println("���ȸ��");
		}else if (grade=='B') {
			System.out.println("�Ϲ�ȸ��");
		}else if (grade=='b') {
			System.out.println("�Ϲ�ȸ��");
		}else {
			System.out.println("�մ�");
		}
		
	}

}
