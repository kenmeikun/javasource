package classTest;

public class Subscriberinfo {
	//속성 이름,아이디,비번,전번,주소
	String name;
	String id;
	String passward;
	String tel;
	String addr;
	//생성자-이름,아이디,비번초기화후 객체생성
	//	--이름,아이디,비번,전번,주소 초기화후 객체생성
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
	
	//기능 비번변경,전번변경,주소 변경
			//setter 메서드
	
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
