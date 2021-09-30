package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamEx2 {

	public static void main(String[] args) {
		InputStream in = System.in;
		OutputStream out = System.out;
		
		FileInputStream fis;
		FileOutputStream fos;

		try {
			int input = in.read();
			out.write(input);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {//무저건 실행 예외가 발생하던 않던간에
			
			try {
				in.close();
				out.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
	}//

}
