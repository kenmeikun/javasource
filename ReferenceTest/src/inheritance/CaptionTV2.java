package inheritance;

public class CaptionTV2 extends TV2 {
	public CaptionTV2(String color, boolean power, int channel) {
		super(color, power, channel);
		
	}

	boolean caption;
	
	void displayCaption(String text) {
		if (caption) {//caption==true¿Í°°À½
			System.out.println(text);
		}
		
	}
}
