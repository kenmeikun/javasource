package shop;


import java.util.Scanner;

public class MyShop implements IShop {

	private String title;
	private Scanner sc = new Scanner(System.in);
	private Product carts[] = new Product[10];// 장바구니 배열
	private String selUser;

	// 회원정보 배열-회원의 이름,결제타입
	private User user[] = new User[2];
	// 상품정보 배열-상품의이름,가격,상품의 정보
	private Product product[] = new Product[5];

	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void genUser() {
		// 고객 두명 생성
		user[0] = new User("홍길동", PayType.CARD);
		user[1] = new User("성춘향", PayType.CASH);
	}

	@Override
	public void genProduct() {
		product[0] = new CellPhone("삼성폴드", 1000000, "SKT");
		product[1] = new CellPhone("아이폰14", 1500000, "KT");
		product[2] = new SmartTV("삼성 3D tv", 1800000, "4K");
		product[3] = new SmartTV("LG 스마트 TV", 3000000, "4k");
		product[4] = new SmartTV("삼성  full HD", 6400000, "full HD");
	}

	@Override
	public void start() {
		System.out.println(title + ":메인화면-계정선택");
		System.out.println("====================");
		for (int i = 0; i < user.length; i++) {
			System.out.println("[" + i + "]" + user[i].getName() + user[i].getPayType());
		}
		System.out.println("[x]종 료");
		System.out.println("선택:  ");
		String input = sc.next();
		System.out.println("##" + input + "선택##");
		// 사용자가 0,1번을 입력한경우
		// x를 입력한경우
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
		System.out.println(title + ":상품목록-상품선택");
		System.out.println("====================");
		// 상품정보 출력
		for (int i = 0; i < product.length; i++) {
			System.out.print("[" + i + "]");
			product[i].printDetail();
		}
		System.out.println("[h]메인화면");
		System.out.println("[c]체크아웃");
		System.out.println("선택: ");
		// 사용자 입력 =>상품선택 0~4(장바구니에 현재선택한 제품 담기) ,h(메인화면),c
		String input = sc.next();
		// "0"=> 0
		// product["0"]
		switch (input) {
		case "h": {
			start();
			break;
		}
		case "c": {
			System.out.println("선택:"+input);
			System.out.println("##"+input+"선택##");			
			checkOut();
			break;
		}
		default:
			//사용자가 선택한 상품을 carts에 담기
			//int num=Integer.parseInt(input);
			
			for (int i = 0; i < carts.length; i++) {
				if (carts[i]==null) {
					carts[i]=product[Integer.parseInt(input)];
					break;
				}
			}
			
			//상품목록보여주기
			productList();
			break;
			
//			for (int j = 0; j < carts.length; j++) {
//				System.out.println();
//			}
			}
			

	}

	public void checkOut() {
	System.out.println(title+": 체크아웃");
	System.out.println("===============");
	int total=0;
	for (int i = 0; i < carts.length; i++) {
		if (carts[i]!=null) {
			System.out.printf("[%d] %s (%d)\n",i,carts[i].getPname(),carts[i].getPrice());
			total+=carts[i].getPrice();
			
		}
		
	}
	System.out.println("결재방법:"+user[Integer.parseInt(selUser)].getPayType());
	System.out.println("합계:"+total);
	System.out.println("[p]이전,[q]결제완료");
	System.out.println("선택:");
	
	String input =sc.next();
	switch (input) {
	case "p": {
		productList();
		break;
	}
	case "q":
		System.out.println("결제가 완료되었습니다.");
		break;
	}
	
	//p,q
	}//checkOut

}
