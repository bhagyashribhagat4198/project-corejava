package collection;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{

int id;
String name;
int age;
Student(int id, String name, int age){
	this.id=id;
	this.name=name;
	this.age=age;
}
	public int compareTo(Student s) {	
		if(age==s.age)
		return 0;
		else if(age>s.age){
			return 1;
		}
		else{
			return -1;
		}	}	}
public class Test {

	public static void main(String[] args) {
		ArrayList<Student>  alist=new ArrayList<Student>();
		alist.add(new Student(101, "ram",21));
		alist.add(new Student(102, "sham",18));
		alist.add(new Student(100, "mira",25));
		
		Collections.sort(alist);
		for(Student s:alist){
			System.out.println(s.id+" "+s.name+" "+s.age);
		}
	}
}
