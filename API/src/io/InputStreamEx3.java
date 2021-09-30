package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamEx3 {

	public static void main(String[] args) {
		InputStream in = System.in;
		OutputStream out = System.out;
		
		FileInputStream fis;
		FileOutputStream fos;
		byte b[]=new byte[100];
		
		try {
			//�Է� ��Ʈ������ ������ byte ����ŭ �о����
			while (in.read(b)!=1) {
				out.write(b);
			}			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {//������ ���� ���ܰ� �߻��ϴ� �ʴ�����
			
			try {
				in.close();
				out.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
	}//

}
