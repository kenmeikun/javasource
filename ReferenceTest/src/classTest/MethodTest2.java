	package classTest;



/*����Ÿ���� �޼ҵ��(*****){
 * 
����Ÿ���� void �� ���� �����Ѵٸ�
������ return Ű���尡 ���;� ��


*/
public class MethodTest2 {
	
	//�ΰ��� ���ڸ� �޾Ƽ� ���Ѱ��������
	int sum(int num1,int num2) {
			int result=num1+num2;
			return result;
	}
	
	void println99() {
		for (int i = 2; i <10; i++) {
		for (int j = 1; j < 10; j++) {
			System.out.printf("%d*%d=%d\n",i,j,i*j);
		}	
		}
	}
}//class
