package inheritance;

class GrandFather{
	void info(){
		System.out.println("Grand Father class Method");
	}
}
class Father extends GrandFather{
	void show(){
		System.out.println("father class method");
	}
}
public class Child extends Father{
	void display(){
		System.out.println("Child class method");
	}
	public static void main(String[] args) {
		Child obj =new Child();
		obj.display();
		obj.show();
		obj.info();
	}
}
