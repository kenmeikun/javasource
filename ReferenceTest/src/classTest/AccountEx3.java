package classTest;

public class AccountEx3 {

	public static void main(String[] args) {
		//�Ƥ�ī��Ʈ��ä��5�������ϰ�ʹ�
//		Account3 account1=new Account3("122-14",250000, "ȫ�浿");
//		Account3 account2=new Account3("122-14",250000, "���浿");
//		Account3 account3=new Account3("122-14",250000, "�̱浿");
//		Account3 account4=new Account3("122-14",250000, "���浿");
//		Account3 account5=new Account3("122-14",250000, "��浿");
		
		//������Ÿ������ ��ü ������ ȿ����
		//�迭���
		Account3 accArr[] = new Account3[5];
		System.out.println(accArr[0]);
		
		accArr[0] =new Account3("122-14",250000, "ȫ�浿");
		accArr[1] =new Account3("122-14",250000, "���浿");
		accArr[2] =new Account3("122-14",250000, "�̱浿");
		accArr[3] =new Account3("122-14",250000, "���浿");
		accArr[4] =new Account3("122-14",250000, "��浿");
		
//		for (int i = 0; i < accArr.length; i++) {
//			Account3 account=accArr[i];
//			//�Ա�
//			account.input(i);
//		System.out.printf(accArr[i].getMoney()+"\t");
//		System.out.printf(accArr[i].getnum()+"\t");
//		System.out.println(accArr[i].getname());
//		}
	accountPrint(accArr);
	System.out.println();
	}
	static	void accountPrint(Account3 accArr[]) {
		for (int i = 0; i < accArr.length; i++) {
			//�Ա�
			
		System.out.printf(accArr[i].getname()+"\t");
		System.out.printf(accArr[i].getnum()+"\t");
		System.out.println(accArr[i].getMoney());
		}
		}
		static	void accountPrint(Account3 account) {
			
				
			System.out.printf(account.getname()+"\t");
			System.out.printf(account.getnum()+"\t");
			System.out.println(account.getMoney());
			
	}
	
	
}
