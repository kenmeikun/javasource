package inheritance;

public class FountainPen extends Ballpen {

		@Override
		public int getAmount() {
			
			return super.getAmount();
		}
		@Override
		public void setAmount(int amount) {
		
		super.setAmount(amount);
		}
		@Override
		public String getColor() {
		
		return super.getColor();
		}
		@Override
		public void setColor(String color) {
	
		super.setColor(color);
		}
		public void refill (int n) {
			setAmount(n);
		}
}

