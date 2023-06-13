package inheritance;

class Animal {
	void eat (){
		System.out.println("Animal Class method");
	}
}
class Lion extends Animal{
	void roar(){
		System.out.println("Lion class method");
	}
}
public class Dog  extends Animal{
	void barks(){
		System.out.println("Dog class Method");
	}	
	public static void main(String[] args) {
		Dog d=new Dog();
		d.barks();
		d.eat();
		Lion l=new Lion();
		l.roar();
		l.eat();
	}
}
