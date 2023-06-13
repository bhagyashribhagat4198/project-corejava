package method;

public class withparameter {

	
	void add(int a, int b)  // formal parameter
	{
		int c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
	
		withparameter obj=new withparameter();
		obj.add(12, 23);  //actual parameter
	}
}
