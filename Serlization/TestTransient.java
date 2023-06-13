package Serlization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;



public class TestTransient {

	public static void main(String[] args) throws Exception {
		
	
Employee e1=new Employee(101,"Ram",24);
	
	FileOutputStream fout = new FileOutputStream("D:\\selenium\\setup\\IOFile\\transient.txt");
	ObjectOutputStream out =new ObjectOutputStream(fout);
	
	out.writeObject(e1);
	out.flush();
out.close();
System.out.println("Success");
}
}