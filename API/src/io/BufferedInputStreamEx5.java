package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.Buffer;

public class BufferedInputStreamEx5 {

	public static void main(String[] args) {
		//fileinputstream+byte배열만 사용하는경우
		try (FileInputStream fis =new FileInputStream("c:\\temp\\Rolling.jpg");
			FileOutputStream fos =new FileOutputStream("c:\\temp\\Rolling.jpg")	
				){
			
			byte data[] =new byte[1024];
			long start =System.currentTimeMillis();
			while (fis.read(data)!=-1) {
				fos.write(data);
			}
			long end=System.currentTimeMillis();
			System.out.println("fileinputstream+byte+fileoutputstream만 사용시:"+(end-start));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		FileInputStream fis=null;
		BufferedInputStream bis =null;
		FileOutputStream fos=null;
		BufferedOutputStream bos=null;
		try {
			
			 fis =new FileInputStream("c:\\temp\\file1.txt");
			 bis =new BufferedInputStream(fis);
			 fos =new FileOutputStream("c:\\temp\\file4.txt");
			 bos =new BufferedOutputStream(fos);
			
			int data;
			while ((data=bis.read())!=-1) {
				bos.write(data);
			}
			bos.flush();//버퍼비우기
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bis.close();
				fis.close();
				bos.close();
				fos.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}

	}

}//
