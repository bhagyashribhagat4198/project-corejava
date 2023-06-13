package io;

import java.io.FileInputStream;


public class FileInputStreamExample {

	public static void main(String[] args) {
		
		try {
			FileInputStream fin =new FileInputStream("D:\\selenium\\setup\\IOFile\\first.txt");
			int i=fin.read();
			System.out.println((char)i);
			fin.close();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
