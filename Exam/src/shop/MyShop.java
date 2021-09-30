package shop;


import java.util.Scanner;

public class MyShop implements IShop {

	private String title;
	private Scanner sc = new Scanner(System.in);
	private Product carts[] = new Product[10];// ��ٱ��� �迭
	private String selUser;

	// ȸ������ �迭-ȸ���� �̸�,����Ÿ��
	private User user[] = new User[2];
	// ��ǰ���� �迭-��ǰ���̸�,����,��ǰ�� ����
	private Product product[] = new Product[5];

	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void genUser() {
		// �� �θ� ����
		user[0] = new User("ȫ�浿", PayType.CARD);
		user[1] = new User("������", PayType.CASH);
	}

	@Override
	public void genProduct() {
		product[0] = new CellPhone("�Ｚ����", 1000000, "SKT");
		product[1] = new CellPhone("������14", 1500000, "KT");
		product[2] = new SmartTV("�Ｚ 3D tv", 1800000, "4K");
		product[3] = new SmartTV("LG ����Ʈ TV", 3000000, "4k");
		product[4] = new SmartTV("�Ｚ  full HD", 6400000, "full HD");
	}

	@Override
	public void start() {
		System.out.println(title + ":����ȭ��-��������");
		System.out.println("====================");
		for (int i = 0; i < user.length; i++) {
			System.out.println("[" + i + "]" + user[i].getName() + user[i].getPayType());
		}
		System.out.println("[x]�� ��");
		System.out.println("����:  ");
		String input = sc.next();
		System.out.println("##" + input + "����##");
		// ����ڰ� 0,1���� �Է��Ѱ��
		// x�� �Է��Ѱ��
		switch (input) {
		case "x": {
			System.exit(0);
			break;

		}
		default:// 0,1
			selUser=input;
			productList();
			break;
		}
	}

	public void productList() {
		System.out.println(title + ":��ǰ���-��ǰ����");
		System.out.println("====================");
		// ��ǰ���� ���
		for (int i = 0; i < product.length; i++) {
			System.out.print("[" + i + "]");
			product[i].printDetail();
		}
		System.out.println("[h]����ȭ��");
		System.out.println("[c]üũ�ƿ�");
		System.out.println("����: ");
		// ����� �Է� =>��ǰ���� 0~4(��ٱ��Ͽ� ���缱���� ��ǰ ���) ,h(����ȭ��),c
		String input = sc.next();
		// "0"=> 0
		// product["0"]
		switch (input) {
		case "h": {
			start();
			break;
		}
		case "c": {
			System.out.println("����:"+input);
			System.out.println("##"+input+"����##");			
			checkOut();
			break;
		}
		default:
			//����ڰ� ������ ��ǰ�� carts�� ���
			//int num=Integer.parseInt(input);
			
			for (int i = 0; i < carts.length; i++) {
				if (carts[i]==null) {
					carts[i]=product[Integer.parseInt(input)];
					break;
				}
			}
			
			//��ǰ��Ϻ����ֱ�
			productList();
			break;
			
//			for (int j = 0; j < carts.length; j++) {
//				System.out.println();
//			}
			}
			

	}

	public void checkOut() {
	System.out.println(title+": üũ�ƿ�");
	System.out.println("===============");
	int total=0;
	for (int i = 0; i < carts.length; i++) {
		if (carts[i]!=null) {
			System.out.printf("[%d] %s (%d)\n",i,carts[i].getPname(),carts[i].getPrice());
			total+=carts[i].getPrice();
			
		}
		
	}
	System.out.println("������:"+user[Integer.parseInt(selUser)].getPayType());
	System.out.println("�հ�:"+total);
	System.out.println("[p]����,[q]�����Ϸ�");
	System.out.println("����:");
	
	String input =sc.next();
	switch (input) {
	case "p": {
		productList();
		break;
	}
	case "q":
		System.out.println("������ �Ϸ�Ǿ����ϴ�.");
		break;
	}
	
	//p,q
	}//checkOut

}
