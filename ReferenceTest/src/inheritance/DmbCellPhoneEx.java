package inheritance;

public class DmbCellPhoneEx {

	public static void main(String[] args) {
		DmbCellPhone phone = new DmbCellPhone();

			phone.color="black";
			phone.model="�ڹ���";
			phone.channel=7;
			
			phone.powerOn();
			phone.powerOff();
			phone.changeChannelDmb(8);
			phone.turnOffDmb();
			phone.bell();
			phone.sendVoice("�ȳ��ϼ���");
			phone.reciveVoice("�ݰ�����");
			phone.hangUp();
	}

}
