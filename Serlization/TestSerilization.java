package Serlization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestSerilization {

	public static void main(String[] args) {
		Student s1=new Student(101,"java");
		try {
			FileOutputStream fout = new FileOutputStream("D:\\selenium\\setup\\IOFile\\serialization.txt");
			ObjectOutputStream out =new ObjectOutputStream(fout);
		out.writeObject(s1);
		out.flush();
	out.close();
	System.out.println("Success");
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
