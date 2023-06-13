package Serlization;

import java.io.Serializable;

public class Employee  implements Serializable{

	int id;
	String name;
	transient int age;
	
	Employee(int id , String name , int age){
		this.id=id;
		this.name=name;
		this.age=age;
		
	}
}
