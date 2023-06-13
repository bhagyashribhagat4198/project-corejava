package constructor;

public class FirstExample {

	FirstExample(){
		System.out.println("Class constructor");
	}
	
	void show(){
		System.out.println("class method");
	}
	public static void main(String[] args) {
		FirstExample obj =new FirstExample();
		obj.show();
	}
}
