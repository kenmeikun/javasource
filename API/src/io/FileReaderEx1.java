package io;

import java.io.FileReader;
import java.io.Reader;

public class FileReaderEx1 {
	/*처리알 파일이 문자라면 reader,writer 가편함
	 * 
	 * char 형태로 처리
		
		*/
	
	public static void main(String[] args) {
		try(Reader reader =new FileReader("c:\\temp\\file1.txt")) {
			
			char[] cbuf =new char[100];
			
			int readcharNo;
			
			while (reader.read(cbuf)!=-1) {
				System.out.println(cbuf);
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}//
