package com.hyndai.project;

import com.samsung.project.*;	

public class AccountEx {

	public static void main(String[] args) {
		//ȫ�浵 ����
	Account account1=new Account("122-01-12222",10000,"ȫ�浿");
//		account1.num="122-01-04444";
//		account1.money=10000;
//		account1.name="������";
//		
		//�Ա�
		account1.input(50000);
		
		//���
	System.out.println("����ݾ�:"+account1.output(20000))	;

	}

}
