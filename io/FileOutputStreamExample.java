package io;

import java.io.FileOutputStream;

public class FileOutputStreamExample {

	public static void main(String[] args) {
		
		
		try {
			FileOutputStream  fs=new FileOutputStream("D:\\selenium\\setup\\IOFile\\first.txt");
		
			fs.write(65);
			fs.close();
			System.out.println("Successfully write operation performed");
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
