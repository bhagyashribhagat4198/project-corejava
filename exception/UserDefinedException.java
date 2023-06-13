package exception;

public class UserDefinedException  extends Exception{

	public UserDefinedException(String  s){
		
		super(s);
	}
	public static void main(String[] args) {	

		try {
			throw new  UserDefinedException("This is user Defined Exception");
	
		} catch (UserDefinedException e) {
		
			
			System.out.println(e);
		}
	}
}
