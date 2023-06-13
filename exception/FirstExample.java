package exception;

public class FirstExample {

	public static void main(String[] args) {
		
		try{
		int data =100/0;
		System.out.println(data);
		}
		catch(Exception  a){
			System.out.println(a);
		}
		System.out.println("Hello");
		
	}
}
