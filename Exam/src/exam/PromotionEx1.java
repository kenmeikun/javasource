package exam;

public class PromotionEx1 {

	public static void main(String[] args) {
		//변수 선언
		//정수타입 =>byte(1byte=8bit) < char(2byte)< short(2byte)< int(4byte)< long(8byte)
		//실수타입=>float(4byte)< double(8byte)
		//1byte =>8비트=>256
		//0 ~ 255 =>-128~127
		
		byte byteValue = 10;
		//자동 형변환
		int intValue=byteValue;
				System.out.println(intValue);
				
				intValue=500;
				long longValue=intValue;
				
				char charValue='A';
				char charValue2=1;
				
				int charValue3=charValue+charValue2;
				
				System.out.println(charValue3);
				//casting 강제 형변환
				System.out.println((char)charValue3);//b
				
		
	}

}
