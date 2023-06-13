package polymorphism;


class Animal{
	
	String color="black";
}
public class Dog  extends Animal{

	String color="red";
	void show(){
		System.out.println(color);
		System.out.println(super.color);
	}
	
	public static void main(String[] args) {
		Dog d=new Dog();
		d.show();
	}
}
