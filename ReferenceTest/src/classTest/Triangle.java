package classTest;

public class Triangle {
	//삼각형 넓이 구하기
	//밑변*높이/2
	int baseline;
	int hei;
	
	//생성자는 기본생성자
	 Triangle() {
			
		}
	
	//속성 :밑변, 높이
	//기능(메소드):밑변*높이/2 결과 리턴
	int getArea(){
		return baseline*hei/2;
	}
	

	
	
}
