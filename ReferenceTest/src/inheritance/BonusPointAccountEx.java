package inheritance;

public class BonusPointAccountEx {

	public static void main(String[] args) {
		BonusPointAccount bonus =new BonusPointAccount("122-12", 10000, "ȫ�浿", 100);
		bonus.input(100000);
		
		System.out.println("�����ܾ�:"+bonus.getMoney());
		System.out.println("���ʽ�����Ʈ:"+bonus.getbonusPoint());
	}

}
