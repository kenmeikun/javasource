package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamEx4 {

	public static void main(String[] args) {
		InputStream in = System.in;
		OutputStream out = System.out;

		byte[] datas = new byte[100];

		// ����ڷκ��� �����͸� �̸��� �ϰ�������� �Է¹����Ŀ�
		// String ��ü�� ��ȯ

		System.out.println("�̸� : ");
		try {
			int nameByte = in.read(datas);// ȫ�浿 ��Ÿ
			//enter:carriage return => 13��,line feed:10 ��
			String name =new String(datas, 0, nameByte-2);
			
			System.out.println("�ϰ� ������:");
			int commentByte=in.read(datas);
			String comment =new String(datas,0,commentByte-2);
			System.out.println("�Է��� �̸�:"+name);
			System.out.println("�Է��� �ϰ� ���� ��:"+comment);
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
