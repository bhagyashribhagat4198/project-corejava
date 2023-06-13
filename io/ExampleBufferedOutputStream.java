package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ExampleBufferedOutputStream {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fs =new FileOutputStream("D:\\selenium\\setup\\IOFile\\five.txt");
			BufferedOutputStream bout=new BufferedOutputStream(fs);
			String s="BufferedOutstream Class example";
			byte b[]=s.getBytes();
			bout.write(b);
			bout.flush();
			bout.close();
			fs.close();	
	System.out.println("Successfully write");		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
