package nestedclass;

abstract class Animal {
	
	abstract void eat();
}
public class anonymousclassexample {

	
	public static void main(String[] args) {
		Animal obj =new Animal(){
			
			void eat() {
				System.out.println("Anonymous class example");	
			}
			
		};
		obj.eat();
	}
}
