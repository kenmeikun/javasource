package exception;

public class AccountEx {

	public static void main(String[] args) {
		Account account =new Account();
		
		try {
			account.withdraw(100000);
		} catch (Exception e) {
			
			//e.printStackTrace();//������ ��� ������ �����ؼ� �������
			System.out.println(e.getMessage());//�޼����� �ҷ��ݴϴ�.
		}
		//try�� �ܵ����θ��´� ��ġ�� ���̳θ��� ��������

	}

}
