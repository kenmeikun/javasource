package io;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx1 {

	public static void main(String[] args) {
		// system.in 키보드 입력
		InputStream in = System.in;
		int input = 0;
		try {
			while ((input = in.read()) != -1) {
				System.out.print((char) input);
			}

		} catch (IOException e) {

			e.printStackTrace();
		}

	}//

}
