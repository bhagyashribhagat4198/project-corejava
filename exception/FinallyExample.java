package exception;

public class FinallyExample {

	
	public static void main(String[] args) {
		
		try{
		int data =10/0;
		}
		finally{
			System.out.println("Finally Always Executed");
		}
	}
}
