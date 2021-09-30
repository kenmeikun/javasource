package classTest;

public class GoodsStock {
	//속성:상품코드(p123450),재고수량
	 String code;
	 int stock;
	//기능 제고수량 증가(입력값 수량,출 ㄴ,)
	//재고수량 감소(이력값 수량,현재값출)
	 
	 
	void addstock(int amount) {
		stock+=amount;
	}
	
	int downstock(int amount) {
		if(stock>amount) {
			 stock-=amount;
		}
		return stock;
	}
}
