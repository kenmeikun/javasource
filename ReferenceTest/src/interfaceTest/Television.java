package interfaceTest;

public class Television implements RemoteControl,Searchable {
	private int volume;
	@Override
	public void turnOn() {
		System.out.println("tv¸¦ ÄÕ´Ï´Ù.");

	}

	@Override
	public void turnOff() {
		System.out.println("tv¸¦ ²ü´Ï´Ù.");

	}

	@Override
	public void setVolume(int volume) {
	if (volume>RemoteControl.MAX_VOLUME) {
		this.volume=RemoteControl.MAX_VOLUME;
	}else if (volume<RemoteControl.MIN_VOLUME) {
		this.volume=RemoteControl.MIN_VOLUME;
	}
	
	else {
		this.volume=volume;
	}
System.out.println("ÇöÀç º¼·ý"+volume);
	}

	@Override
	public void search() {
		// TODO Auto-generated method stub
		
	}
	

}//CLASS
