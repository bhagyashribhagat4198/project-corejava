package io;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExampleFileReader {

	
	public static void main(String[] args) {
		try {
			FileReader fr=new FileReader("D:\\selenium\\setup\\IOFile\\second.txt");
			int i ;
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i);
			}
		fr.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
