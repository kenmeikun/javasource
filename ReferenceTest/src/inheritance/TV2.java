package inheritance;

public class TV2 {
	//�Ӽ�(�ʵ�,�ɹ�����,������Ƽ) => ����,��������,ä��
	String color;//red,blue,black....
	boolean power;//on,off
	int channel;
	
	
//	public TV2() {
//		super();
//	}
	
	public TV2(String color, boolean power, int channel) {
		super();
		this.color = color;
		this.power = power;
		this.channel = channel;
	}
	//����(�޼ҵ�) => ä�� ����(����,����)�ϴ�,������ �Ѵ�/����
	void channelUp() {
		//���ؾ��ϴ� �۾� �ۼ� ���� ä�� 7=>8,9,10....
		channel++;
	}
	void channelDown() {
		//channelDown �� �ؾ� �ϴ� �۾� �ۼ� 7=>6,5,4.....
		channel--;
	}
	void power() {
		//power�� �ؾ� �ϴ� �۾� on=>off,off => on
		power =!power;
	}
	//
	public String getColor() {
		return color;
	}
	public boolean isPower() {
		return power;
	}
	public int getChannel() {
		return channel;
	}
}	
