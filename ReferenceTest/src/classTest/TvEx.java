package classTest;

public class TvEx {

	public static void main(String[] args) {
		//객체 선언 생성
		TV tv =new  TV();//인스턴스생성후 주소를 tv에저장
		System.out.println(tv);

		//객체 조작
		tv.power=true;//on
		tv.channel=2;
		
		tv.channelUp();//메소드 호출
		System.out.println("채널 상태:"+tv.channel);
		
	}

}
