package exception;

public class ThrowsExample {

	void show() throws ArithmeticException{
		int a=10/0;
	}
	
	public static void main(String[] args) {
		ThrowsExample obj =new ThrowsExample();
		obj.show();
		
		
	}
}
