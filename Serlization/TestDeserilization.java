package Serlization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class TestDeserilization {

	public static void main(String[] args) {
		try {
			ObjectInputStream obj=new ObjectInputStream(new FileInputStream("D:\\selenium\\setup\\IOFile\\serialization.txt"));
		
			Student s= (Student) obj.readObject();
			System.out.println(s.id+" "+s.name);
		obj.close();
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
