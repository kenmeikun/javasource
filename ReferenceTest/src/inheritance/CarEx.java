package inheritance;

public class CarEx {

	public static void main(String[] args) {
		FireEngine f;
		Ambulance a;
		
		f= new FireEngine();
		
		Car car=f; //��Ӱ���� �� ��ȯ���� ���ɽ���
		
		FireEngine f2;
		f2=(FireEngine)car;//�ٿ��ɽ���(����ȯ ���� �Ұ���)
		
		f2.water();
		

	}

}
