package com.samsung.project;

public class Account {
	// �Ӽ� ���¹�ȣ,�ܾ�,�̸�
	private String num;
	private int money;
	private String name;

	// ��� �Ա�,(�Է°�,��ȯ������,=>�����ܾ�+=�Աݾ�
	// ���(�Է°�,��ȯ=�����ݾ�)=>�����ܾ�-=��ݾ�
	
	//�⺻������
	
	public	void input(int amount) {
		money += amount;
	}

	public Account(String num, int money, String name) {
		super();
		this.num = num;
		this.money = money;
		this.name = name;
	}

	public int output(int amount) {
		if (money > amount) {
			money -= amount;
		} else {
			System.err.println("�ܾ��� �����մϴ�!!");
		}
		return money;
	}
}
