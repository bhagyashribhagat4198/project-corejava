package io;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ExampleByteArrayOutputStream {

	public static void main(String[] args) {
		try {
			FileOutputStream  fs=new FileOutputStream("D:\\selenium\\setup\\IOFile\\third.txt");
		
		FileOutputStream  fs1=new FileOutputStream("D:\\selenium\\setup\\IOFile\\fourth.txt");
		
		ByteArrayOutputStream  bout =new ByteArrayOutputStream();
		bout.write(65);
		bout.writeTo(fs);
		bout.writeTo(fs1);
		
		bout.flush();
		bout.close();
		System.out.println("Success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
