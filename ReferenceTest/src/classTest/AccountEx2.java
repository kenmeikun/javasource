package classTest;

public class AccountEx2 {

	public static void main(String[] args) {
		//ȫ�浵 ����
		Account2 account1=new Account2();
//		account1.num="122-01-04444";
//		account1.money=10000;
//		account1.name="������";
		
		//�����ڻ�������ʰ� �ɹ������ʱ�ȭ
		account1.setmoney(100000);
		//���¹�ȣ
		account1.setnum("122-01-04444");
		//�̸�
		account1.setname("�浵��");
		//�Ա�
		account1.input(50000);
		System.out.println("�Ա��� �ܾ�:");
		
		//���
	System.out.println("����ݾ�:"+account1.output(20000))	;
	//���������
	Account2 account2 =new Account2("122-01-0444 ","������");
	
	Account2 account3 =new Account2("122-01-0444 ",1000000,"������");
	System.out.println();
	}//�ѸϤ�

	
	
}
