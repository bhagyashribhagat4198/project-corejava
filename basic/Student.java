package basic;

public class Student {

	
	int id=101;
	String name="ram";
	static String collegename="bharati";
	
	void show(){
		System.out.println(id+" "+name+" "+collegename);
	}
	
	public static void main(String[] args) {
		Student obj =new Student();
obj.show();
System.out.println(obj.id);	
System.out.println(collegename);
	}
}
