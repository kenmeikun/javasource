package io;

import java.io.FileReader;
import java.io.Reader;

public class FileReaderEx2 {
	/*ó���� ������ ���ڶ�� reader,writer ������
	 * 
	 * char ���·� ó��
		
		*/
	
	public static void main(String[] args) {
		try(Reader reader =new FileReader("c:\\temp\\file1.txt")) {
			
			char[] cbuf =new char[100];
			
			int readcharNo;
			
			//while (readcharNo=reader.read(cbuf)!=-1) 
//			{
//				String data =new String(cbuf,0,readcharNo);
//				System.out.println(cbuf);
//			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}//
