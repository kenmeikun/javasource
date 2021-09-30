package classTest;

public class Triangle3 {
	//삼각형 넓이 구하기
	//밑변*높이/2
	private int baseline;
	private int hei;
	
	//생성자는 기본생성자
	 Triangle3(int baseline,int hei) {
			this.baseline=baseline;
			this.hei=hei;
		}
	
	//속성 :밑변, 높이
	//기능(메소드):밑변*높이/2 결과 리턴
	int getArea(){
		return baseline*hei/2;
	}
	

	
	
}
