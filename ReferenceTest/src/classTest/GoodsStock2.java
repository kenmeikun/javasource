package classTest;

public class GoodsStock2 {
	// 속성:상품코드(p123450),재고수량
	private String code;
	private int stock;
	// 기능 제고수량 증가(입력값 수량,출 ㄴ,)
	// 재고수량 감소(이력값 수량,현재값출)

	// 기본생성자
	GoodsStock2() {

	}
	//생성자 오버로딩
	//맴버변수 초기화 목적
	GoodsStock2(String code,int stock) {
		this.code=code;
		this.stock=stock;
	}
	

	void addstock(int amount) {
		stock += amount;
	}

	int downstock(int amount) {
		if (stock > amount) {
			stock -= amount;
		}
		return stock;
	}
	
	//현재 재고수량을 리턴하는 메서드
	int getStockNum() {
		return stock;
	}
	
}
