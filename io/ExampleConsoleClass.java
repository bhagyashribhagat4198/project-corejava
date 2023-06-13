package io;

import java.io.Console;

public class ExampleConsoleClass {

	
	public static void main(String[] args) {
		Console c=System.console();
		System.out.println("Enter text ");
		String s=c.readLine();
		System.out.println(s);
	}
}
