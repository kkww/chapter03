package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			//FileInputStream fis = 	//FileInputStream 대신 InputStream 해줘도 됨
					fis = new FileInputStream("./dooly.jpg");	//./는 [~~workspace path]\[project name]\dooly.jpg이지, [project name]\[package name] 혹은 src 경로가 아니다.
			//FileOutputStream fos =
					fos = new FileOutputStream("./dooly2.jpg");
			int data = -1;
			while((data = fis.read()) != -1) { //file 끝은 -1
				fos.write(data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {	//그냥 close만 두개 하면 fis != null, fos == null 일 때 오류가 남
				if(fis != null)
					fis.close();
				if(fos != null)
					fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
