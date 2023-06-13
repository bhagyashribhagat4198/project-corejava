package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExampleBufferInputSttream {

	
	public static void main(String[] args) {
		try {
			FileInputStream fin =new FileInputStream("D:\\selenium\\setup\\IOFile\\five.txt");
	BufferedInputStream bin =new BufferedInputStream(fin);
		int i;
		while((i=bin.read())!=-1){
			
			System.out.print((char)i);
		}
		bin.close();
		fin.close();
	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
