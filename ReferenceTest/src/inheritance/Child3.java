package inheritance;

class Child3 extends Parent2 {
	
	String field2;
	
	@Override
	public void method1() {
		System.out.println("method1");
		super.method1();
	}
	@Override
	public void method2() {
		System.out.println("method2");
		super.method2();
	}
	public void method3() {
		// TODO Auto-generated method stub
		
	}

}
