package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee{
	int id ;
	String name;
	int age;
	Employee(int id, String name, int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
}
class AgeComparator implements Comparator<Employee> {
	public int compare(Employee e1, Employee e2) {
		if(e1.age==e2.age){
			return 0;
		}
		else if(e1.age>e2.age){
		return 1;
	}
		else{
			return -1;
		}	
}
}
	class NameComparator implements Comparator<Employee>{

		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.name.compareTo(o2.name);
		}	
	}
public class TestComparator {
	public static void main(String[] args) {
		ArrayList<Employee> alist=new ArrayList<Employee>();
		alist.add(new Employee(111,"ram",23));
		alist.add(new Employee(114,"sita",24));
		alist.add(new Employee(106,"sham",29));
		
		System.out.println("-----Sort By Name----------");
		Collections.sort(alist,new  NameComparator());
		for(Employee e:alist){
			System.out.println(e.id+" "+e.name+" "+e.age);
		}
		System.out.println("-----Sort By Age----------");
		Collections.sort(alist,new  AgeComparator());
		for(Employee e:alist){
			System.out.println(e.id+" "+e.name+" "+e.age);
		}
	}
}
