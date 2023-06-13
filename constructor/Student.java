package constructor;

public class Student {
	
	int id;
	String name;
	
	Student()   // no argument constructor
	{
		id=101;
		name="ram";			
	}
	Student(int id, String name) // parameterized constructor
	{
		this.id=id;
		this.name=name;
	}	
	void show(){
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
		Student obj =new Student();
		Student s1=new Student(100,"xyz");
		obj.show();
		s1.show();
	}
}
