package abstraction;

// abstract class 
abstract class Car{
	
	// abstract method always declare no implementation
	abstract void run();
	//non abstract method
	void show(){
		System.out.println("Abstract class method ");
	}
}
public class TataCar  extends Car {
	void run(){
		System.out.println("Tata car is running");
	}
	public static void main(String[] args) {
		Car obj =new TataCar();
		obj.run();
		obj.show();
	}
}
