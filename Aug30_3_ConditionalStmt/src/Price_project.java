
public class Price_project {

	public static void main(String[] args) {
		//���� :34500
		//���� :51000
		//-----------
		//�Ž�����:16500
		//1����:1
		//5õ��:1
		//1õ��:1
		//5���:1
		
		int total =34500; //����
		int input =51000;//�� �ݾ�
		int money= input - total;// �Ž����� 
		System.out.println("����:"+total);
		System.out.println("�� �ݾ�:"+input);
		System.out.println("�Ž��� ��:"+money);
		int m10000, m1000, m500, m100, m50 , m10 ,ban;
		m10000= money/10000;
		money=money%10000;
		m1000= money/1000; 
		money= money%1000;
		m500 = money/500;
		money= money%500;
		m100 =money/100;
		money =money%100;
		m50 =money/50;
		money%=50;
		m10=money/10;
		money%=10;
		ban= money>=5?1:0;//�������ݾ�(��ø�)
		
		
		System.out.println("-------------");
		System.out.println("����¥��"+m10000);
		System.out.println("õ��¥��:"+m1000);
		System.out.println("�����¥��:"+m500);
		System.out.println("���¥��:"+m100);
		System.out.println("���ʿ�¥��:"+m50);
		System.out.println("�ʿ�¥��:"+(m10+ban));
		//System.out.println("������(�ݿø�):"+ money);
	}

}
