package classTest;

public class Car2 {

	//�Ӽ�:����ȸ��(����,���...),�𵨸�(����Ƽ��)...,����,�ִ�ӵ�	
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	//����: �����ϴ�,�����ϴ�
	
	//������ -Ŭ�����̸��� ����/���� Ÿ�� ����/�ߺ�����(������ �����ε�)
	//����-�ʵ忡 �ʱⰪ�� ����/��ü �����ϸ鼭 �غ��ؾ� �ϴ� �۾� ����
	Car2(){
		System.out.println("car2�⺻ ������");
	}
	Car2(String model){
		System.out.println("car2�⺻ model�ʱ�ȭ");
	}
	Car2(String model,String color){
		System.out.println("car2�⺻ model,color�ʱ�ȭ");
	}	
	 Car2(String company, String model, String color, int maxSpeed) {
		System.out.println("Car2 ������-�Ӽ� ��� �ʱ�ȭ");
	}
	 
	//����-�Ž��
	//����Ÿ�� �޼ҵ��(){}
	//����Ÿ�� �޼ҵ��(){Ÿ�� ������,.......}
	void forward() {
		System.out.println("�����ϴ�");
	}
	void backword() {
		System.out.println("�����ϴ�");
	}
}
