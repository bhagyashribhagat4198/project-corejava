package Serlization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class Test {

	public static void main(String[] args) {
		try {
		ObjectInputStream obj=new ObjectInputStream(new FileInputStream("D:\\selenium\\setup\\IOFile\\transient.txt"));
		
			Employee e= (Employee) obj.readObject();
			System.out.println(e.id+" "+e.name+" "+e.age);
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
