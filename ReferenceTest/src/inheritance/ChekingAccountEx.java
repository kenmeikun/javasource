package inheritance;

public class ChekingAccountEx {

	public static void main(String[] args) {
		ChekingAccount chekingAccount =new ChekingAccount("122-12",200000,"ȫ�浿","122-12-133");
		
		//System.out.println(chekingAccount.pay("322-12", 20000));
		System.out.println(chekingAccount.pay("122-12-133", 20000));
		
	}

}
