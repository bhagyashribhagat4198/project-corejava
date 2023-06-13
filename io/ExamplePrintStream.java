package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class ExamplePrintStream {

	public static void main(String[] args) {
		try {
			FileOutputStream fs =new FileOutputStream("D:\\selenium\\setup\\IOFile\\Six.txt");
		PrintStream ps=new PrintStream(fs);
		ps.print(1);
		ps.print("November");
		
		ps.close();
		fs.close();
		System.out.println("Success");
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
