package inheritance;

public class CaptionTV extends TV {
	boolean caption;
	
	void displayCaption(String text) {
		if (caption) {//caption==true�Ͱ���
			System.out.println(text);
		}
	}
}
