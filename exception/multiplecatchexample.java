package exception;

public class multiplecatchexample {

	
	public static void main(String[] args) {
		
		try{
		int a[]={12,4,5,5,6};
		System.out.println(a[5]);
		}
		catch(ArrayIndexOutOfBoundsException a){
			System.out.println("Array Exception Catch "+a);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
			}
}
