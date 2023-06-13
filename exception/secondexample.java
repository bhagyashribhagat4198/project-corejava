package exception;

public class secondexample {

	
	public static void main(String[] args) {
		
		try{
		int a[]={12,4,5,60,9};
		
		System.out.println(a[6]);
		}catch(Exception e){
			System.out.println(e);
		}
		
		System.out.println("rest of the code");
	}
}
