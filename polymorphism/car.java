package polymorphism;


class Vehicle {
	
	void run(){
		System.out.println("Vehicle is running");
	}
}
public class car   extends Vehicle {

	void run(){
		System.out.println("Car is running");
	}
	
	public static void main(String[] args) {
		car obj =new car();
		Vehicle v=new car();
		
		obj.run();
		v.run();
	}
}
