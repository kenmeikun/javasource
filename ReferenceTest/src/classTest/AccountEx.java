package classTest;

public class AccountEx {

	public static void main(String[] args) {
		//ȫ�浵 ����
		Account account1=new Account();
		account1.num="122-01-04444";
		account1.money=10000;
		account1.name="������";
		
		//�Ա�
		account1.input(50000);
		
		//���
	System.out.println("����ݾ�:"+account1.output(20000))	;

	}

}
