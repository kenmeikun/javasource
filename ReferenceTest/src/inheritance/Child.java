package inheritance;
// Ȯ��
// extends �θ�Ŭ���� ��
// �����ڿ� �ʱ�ȭ ���� ��ӵ��� �ʽ��ϴ�.	
// private �ɹ������� ������ ���ѵ�
// 
public class Child extends Parent {

	public Child(int age) {
		super(age);//parent int �� �޴� ������ ȣ��
	
	}
	
	void play() {
		System.out.println("����!!!");
	}
	@Override
	public void print() {
		System.out.println("�ȳ�");
	}
		
}
