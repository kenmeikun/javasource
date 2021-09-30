package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamEx4 {

	public static void main(String[] args) {
		InputStream in = System.in;
		OutputStream out = System.out;

		byte[] datas = new byte[100];

		// 사용자로부터 데이터를 이름과 하고싶은말을 입력받은후에
		// String 객체로 변환

		System.out.println("이름 : ");
		try {
			int nameByte = in.read(datas);// 홍길동 엔타
			//enter:carriage return => 13번,line feed:10 번
			String name =new String(datas, 0, nameByte-2);
			
			System.out.println("하고 싶은말:");
			int commentByte=in.read(datas);
			String comment =new String(datas,0,commentByte-2);
			System.out.println("입력한 이름:"+name);
			System.out.println("입력한 하고 싶은 말:"+comment);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				in.close();
				out.close();
			} catch (Exception e2) {
				
			}
		}
	}////

}
