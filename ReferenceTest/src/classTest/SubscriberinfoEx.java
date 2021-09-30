package classTest;

public class SubscriberinfoEx {

	public static void main(String[] args) {
		Subscriberinfo info1 =new Subscriberinfo("홍길동","hong123", "hong1234");
		Subscriberinfo info2 =new Subscriberinfo("성춘향","sung123", "hong1234","010-1234-1234", "북조선");
	//번호추가
	info1.setTel("010-5151-51515");
	//주소변경
	info2.setAddr("지옥불반도");
	}

}//main
