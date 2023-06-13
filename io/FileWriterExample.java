package io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
	
	public static void main(String[] args) {
		
		try {
			FileWriter fw=new FileWriter("D:\\selenium\\setup\\IOFile\\second.txt");
		  fw.write("This is File Writer class Program ");
		fw.close();
		System.out.println("Successfully Write");
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
