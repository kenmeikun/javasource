package classTest;

public class GoodsStockEx2 {

	public static void main(String[] args) {
		GoodsStock2 product1 =new GoodsStock2("p12345",30);
		//클래스 외부에서 속성을 직접변경하는건안됨
//		product1.code="p12345";
//		product1.stock=30;
		
		//상품판매=>재고감소
		//호출 =>리턴값이있으면 리턴값 받기(syso,변수처리)
		//System.out.println("현재재고:"+product1.downstock(15));
		//변수선언
		int stock=product1.downstock(15);
		System.out.println("현재재고:"+stock);
		//반품=>재고 증가
		product1.addstock(5);
		System.out.println("현재 재고수량"+product1.getStockNum());
	}

}
