package shop;

public class CellPhone extends Product  {

	public	String carrier;//��Ż� ����
	public CellPhone(String pname, int price,String carrier) {
		super(pname, price);
		this.carrier=carrier;
	}



	@Override
	public void printExtra() {
		System.out.println("��Ż� ����:" + carrier);
		
	}

}
