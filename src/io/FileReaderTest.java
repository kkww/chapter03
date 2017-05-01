package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("./hello.txt"); //UTF-8 Encoding
			
			int count = 0;
			int data = -1;
			while( (data = fr.read()) != -1 ) { // 3byte씩 read한다.
				System.out.print((char)data);
				count++;
			}
			System.out.println("\nread count : " + count); // count : 5
			
			FileInputStream fis = new FileInputStream("./hello.txt");
			data = -1;
			count = 0;
			while( (data = fis.read()) != -1 ) { // 1byte씩 read한다.
				System.out.print((char)data);
				count++;
			}
			System.out.println("\nread count : " + count); // count : 15 (한글 다섯 글자가 15count라는 것은, 한 글자가 3byte라는 말)
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
