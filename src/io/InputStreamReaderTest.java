package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		InputStreamReader isr = null;
		
		try {
			/*FileInputStream fis =
					new FileInputStream("./ms949.txt"); //주 스트림
			*/
			isr = new InputStreamReader(new FileInputStream("./ms949.txt"), "ms949"); //보조 스트림(주스트림, encoding);
			
			int data = -1;
			while( (data = isr.read()) != -1 ) {
				System.out.print((char)data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(isr != null)
					isr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
