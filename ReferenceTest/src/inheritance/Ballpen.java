package inheritance;

public class Ballpen extends SharpPencil {
	
	
	private String color;
	
	@Override
	public int getAmount() {
	
		return super.getAmount();
	}
	@Override
	public void setAmount(int amount) {
		
		super.setAmount(amount);
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color=color;
	}
	
	
	
}
