package io;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

//문자 변환 보조 스트림
//바이트기반스트림 =>reader or writer 로 변환해서 사용
//인코딩 방식 지정
public class InputStreamReaderEx1 {

	public static void main(String[] args) {
		try (InputStreamReader reader = new InputStreamReader(new FileInputStream("c:\\temp\\file1.txt"), "ms949");
				FileWriter writer = new FileWriter("c:\\temp\\file3.txt")) {
			char cbuf[]=new char[100];
			while (reader.read(cbuf)!=-1) {
				writer.write(cbuf);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
