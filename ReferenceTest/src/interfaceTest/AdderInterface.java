package interfaceTest;
	
//1.����ʵ常����
//2.�߻� �żҵ常 ����

public interface AdderInterface {
	//
	public static final int X=100;
	
	void method1();
	//1.8 ����
	//static�޼ҵ�� default �޼ҵ� ���� �� ����
	static void method2() {
		
	}
	default void method3() {
		
	}
}
