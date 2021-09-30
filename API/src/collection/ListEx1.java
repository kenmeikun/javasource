package collection;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {

	/*
	 * �÷��� �����ӿ�ũ -���� �����͵��� �����ϴ� Ŭ���׵��� ǥ��ȭ�� ���� Collection-List,Set map
	 * 
	 * list(�������̽�):�������ִ�, �������� �ߺ� ���� ���� Ŭ����:vector,ArrayList,linkedList,stack.....
	 * �迭�� ���� �����ε�,����Ų����
	 * 
	 * E,T,K,V,:��ü Ÿ���� ����
	 * 
	 * �⺻Ÿ�� => ��ü Ÿ��(mapperŬ����) int integer float =>float
	 */
	public static void main(String[] args) {
		// ��ü ����
		List<String> list1 = new ArrayList<String>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		// ������ �߰�=>add()
		list1.add("���");
		list1.add("��");
		list1.add("������");
		list1.add("����");
		list1.add("����");
		list1.add("�ٳ���");

		// ������ ��������
		for (String str : list1) {
			System.out.println(str);
		}
		System.out.println();

		System.out.println(list1); // toString ()�������̵� �Ǿ� ����

		System.out.println();

		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		System.out.println();

		list2.add(10);
		list2.add(20);
		list2.add(30);
		list2.add(40);
		list2.add(50);
		list2.add(60);

		for (Integer i : list2) {
			System.out.println(i);
		}

		// �հ� ���ϱ�
		int sum = 0;
//		for (Integer i = 0; i < list2.size(); i++) {
//			sum += i;
//		}
//
		for (Integer i : list2) {
			sum += i;
		}
		System.out.println("�հ�" + sum);

	}// main

}
