package classTest;

public class Subscriberinfo {
	//�Ӽ� �̸�,���̵�,���,����,�ּ�
	String name;
	String id;
	String passward;
	String tel;
	String addr;
	//������-�̸�,���̵�,����ʱ�ȭ�� ��ü����
	//	--�̸�,���̵�,���,����,�ּ� �ʱ�ȭ�� ��ü����
	public Subscriberinfo(String name, String id, String passward) {
		super();
		this.name = name;
		this.id = id;
		this.passward = passward;
	}
	public Subscriberinfo(String name, String id, String passward, String tel, String addr) {
		super();
		this.name = name;
		this.id = id;
		this.passward = passward;
		this.tel = tel;
		this.addr = addr;
	}
	
	//��� �������,��������,�ּ� ����
			//setter �޼���
	
	public void setPassward(String passward) {
		this.passward = passward;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
	
}
