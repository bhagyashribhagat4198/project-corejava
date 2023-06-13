package io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExamplePrintWriter {

	public static void main(String[] args) {
		//Write a data on console
		PrintWriter obj =new PrintWriter(System.out);
		obj.write("PrintWriter class example");
		obj.flush();
		obj.close();
		
		//Write a data on a file	
		try {
			PrintWriter obj1 =new PrintWriter("D:\\selenium\\setup\\IOFile\\seven.txt");
		
			obj1.write("Hello");
			obj1.flush();
			obj1.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
