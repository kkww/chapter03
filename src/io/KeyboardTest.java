package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class KeyboardTest {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			InputStreamReader isr = new InputStreamReader(System.in, "utf-8"); //키보드 입력
			br = new BufferedReader(isr); //string으로 받음
			
			while(true) {
				System.out.print(">>");
				String input = br.readLine();
				
				if(input == null) {
					break;
				}
				
				if("exit".equals(input)) {
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
