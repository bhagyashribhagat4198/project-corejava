package exception;

public class ThrowExample {

	
	public void valid(int speed){
		if(speed>80){
		
			throw new ArithmeticException("Speed Out of Limit");
		}
		else{
			System.out.println("Speed is under limit");
		}
	}
	public static void main(String[] args) {
		ThrowExample obj =new ThrowExample();
		obj.valid(100);
	}
}
