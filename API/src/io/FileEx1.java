package io;

import java.io.File;

/*
������ �ٷ�� ���� Ŭ����
����(���丮):/,\

\t,\n,\b....
*/
public class FileEx1 {

	public static void main(String[] args) {
		File file =new File("c:\\temp\\test1.txt");
		File file2 =new File("c:\\temp","test1.txt");
		
		File file3 =new File("c:\\temp");
		File file4 =new File(file3,"test1.txt");
		
		
		
		
	}//main
	
	

}///
