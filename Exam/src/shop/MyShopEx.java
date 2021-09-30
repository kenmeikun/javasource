package shop;



public class MyShopEx {

	public static void main(String[] args) {
		MyShop shop =new MyShop();
		//상점 이름 지정 
		shop.setTitle("코스트코");
		//고객 생성
		shop.genUser();
		//재품생성
		shop.genProduct();
		//상점시작
		shop.start();
		

	}

}
