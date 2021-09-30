package inheritance;

public class CarEx {

	public static void main(String[] args) {
		FireEngine f;
		Ambulance a;
		
		f= new FireEngine();
		
		Car car=f; //상속관계는 형 변환가능 업케스팅
		
		FireEngine f2;
		f2=(FireEngine)car;//다운케스팅(형변환 생략 불가ㅓ)
		
		f2.water();
		

	}

}
