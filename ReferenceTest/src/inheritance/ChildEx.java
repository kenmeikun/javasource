package inheritance;

public class ChildEx {

	public static void main(String[] args) {
		//child 按眉 积己 =>2啊瘤  
		
		//child 按眉 积己
		//1)super();=>object 积己磊 龋免
		//2)this.age =age
		//3)
		//
		Child child =new Child(25);
		System.out.println("child age"+child.getAge());
		child.play();
			child.print();
		Parent parent = new Child(26);
		System.out.println("child age"+parent.getAge());
		//parent.play();给何抚
		parent.print();
	}

}
