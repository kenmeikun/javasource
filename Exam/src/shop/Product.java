package shop;

//반추상	:일반클래스와 동일한데,추상메서드도 가지고있는상태
//추상클래스
public abstract class Product {

	private String pname;
	private int price;

	public Product(String pname, int price) {
		super();
		this.pname = pname;
		this.price = price;
	}

	public void printDetail() {
		System.out.println("상품명:" + this.pname);
		System.out.println("가격" + this.price);
		printExtra();
	}

	public abstract void printExtra();

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
