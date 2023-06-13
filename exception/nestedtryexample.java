package exception;

public class nestedtryexample {

	public static void main(String[] args) {
		try{
			try{
				int data =30/0;
				System.out.println(data);
				
			}catch(ArithmeticException a){
				System.out.println(a);
			}
		}
		catch(Exception e){
		}
			try
			{
				int a[]={34,5,6};
				System.out.println(a[5]);
			}
			catch(ArrayIndexOutOfBoundsException ae){
				System.out.println(ae);
			}
		}
	}

