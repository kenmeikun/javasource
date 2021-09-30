package io;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

//���� ��ȯ ���� ��Ʈ��
//����Ʈ��ݽ�Ʈ�� =>reader or writer �� ��ȯ�ؼ� ���
//���ڵ� ��� ����
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
