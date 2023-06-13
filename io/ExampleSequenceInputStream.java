package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class ExampleSequenceInputStream {

	public static void main(String[] args) {
	try {
		FileInputStream  fin=new FileInputStream("D:\\selenium\\setup\\IOFile\\five.txt");
		
		FileInputStream  fin1=new FileInputStream("D:\\selenium\\setup\\IOFile\\fourth.txt");
	
	SequenceInputStream sin=new SequenceInputStream(fin, fin1);
	int i;
	while((i=sin.read())!=-1){
		System.out.print((char)i);
	}
	
	sin.close();
	fin.close();
	fin1.close();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
	}
}
