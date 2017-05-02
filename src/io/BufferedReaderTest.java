package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderTest {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			FileInputStream fis = //file->byte
					new FileInputStream("./src/io/BufferedReaderTest.java");
			
			InputStreamReader isr = //byte->charecter
					new InputStreamReader(fis, "utf-8");
			
			br = new BufferedReader(isr); //string으로 받음
			
			int lineNumber = 1;
			String line = null;
			while( (line = br.readLine()) != null ) {
				System.out.println(lineNumber++ + " " + line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null)
					br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
