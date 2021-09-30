package classTest;

public class AccountEx3 {

	public static void main(String[] args) {
		//아ㅓ카운트객채를5개생성하고싶다
//		Account3 account1=new Account3("122-14",250000, "홍길동");
//		Account3 account2=new Account3("122-14",250000, "강길동");
//		Account3 account3=new Account3("122-14",250000, "미길동");
//		Account3 account4=new Account3("122-14",250000, "정길동");
//		Account3 account5=new Account3("122-14",250000, "욱길동");
		
		//동일한타입으로 객체 생성시 효율성
		//배열사용
		Account3 accArr[] = new Account3[5];
		System.out.println(accArr[0]);
		
		accArr[0] =new Account3("122-14",250000, "홍길동");
		accArr[1] =new Account3("122-14",250000, "강길동");
		accArr[2] =new Account3("122-14",250000, "미길동");
		accArr[3] =new Account3("122-14",250000, "정길동");
		accArr[4] =new Account3("122-14",250000, "욱길동");
		
//		for (int i = 0; i < accArr.length; i++) {
//			Account3 account=accArr[i];
//			//입금
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
			//입금
			
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
