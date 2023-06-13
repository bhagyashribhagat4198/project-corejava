package basic;
public class DataTypeExample {
	byte b =123;
	short s=12345;
	int i=123456;
	long l=1231243242;
	float f=12.34f;
	double d=12.3456d;
	char c='a';
	boolean bol=true;
	void display()
	{
	System.out.println("Value of byte "+b);	
	System.out.println("Value of short "+s);
	System.out.println("Value of int "+i);
	System.out.println("Value of long "+l);	
	System.out.println("Value of float "+f);
	System.out.println("Value of double "+d);
	System.out.println("Value of char "+c);
	System.out.println("Value of boolean "+bol);		
	}
	public static void main(String args[]){
		DataTypeExample obj=new DataTypeExample();
		obj.display();
	}
}
