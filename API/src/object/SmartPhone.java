package object;

public class SmartPhone {
	private String company;
	private String os;
	public SmartPhone(String company, String os) {
		super();
		this.company = company;
		this.os = os;
	}
	@Override
	public String toString() {//��ü�� ������ �ִ� �ɹ� ������ ���� ����ϴ� �뵵
		return "SmartPhone [company=" + company + ", os=" + os + "]";
	}
	
	
}
