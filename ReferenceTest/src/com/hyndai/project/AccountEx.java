package com.hyndai.project;

import com.samsung.project.*;	

public class AccountEx {

	public static void main(String[] args) {
		//홍길도 계좌
	Account account1=new Account("122-01-12222",10000,"홍길동");
//		account1.num="122-01-04444";
//		account1.money=10000;
//		account1.name="아이유";
//		
		//입금
		account1.input(50000);
		
		//출금
	System.out.println("현재금액:"+account1.output(20000))	;

	}

}
