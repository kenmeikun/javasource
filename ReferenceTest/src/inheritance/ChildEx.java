package inheritance;

public class ChildEx {

	public static void main(String[] args) {
		//child ��ü ���� =>2����  
		
		//child ��ü ����
		//1)super();=>object ������ ȣ��
		//2)this.age =age
		//3)
		//
		Child child =new Child(25);
		System.out.println("child age"+child.getAge());
		child.play();
			child.print();
		Parent parent = new Child(26);
		System.out.println("child age"+parent.getAge());
		//parent.play();���θ�
		parent.print();
	}

}
