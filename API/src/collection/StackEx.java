package collection;

import java.util.Stack;

public class StackEx {
	
	//STACK:LIFO(last in first out ���Լ���)
	//: ���İ�� ,���� ��ȣ �˻�,undo,redo �������� �ڷ�/������

	public static void main(String[] args) {
		Stack<String> stack =new Stack<String>();
		
		//������ ����
		stack.push("���");
		stack.push("����");
		stack.push("�ٳ���");
		stack.push("��");
		
		//������ ��������
		System.out.println(stack);
		
		System.out.println();
		
		while (stack.empty()) {
			System.out.println(stack.pop());
		}

	}//main

}//class
