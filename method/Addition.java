package method;

public class Addition {

	void add(){
		
		int a=10 ,b=30, c;
		c=a+b;
		System.out.println("Value of c= "+c);	
	}
	
	int sum(){
		int n=12, m=34, s;
		s=n+m;
		System.out.println("value of s= "+s);
		return s;
	
	 }
	public static void main(String args[]){
		Addition obj =new Addition();
		obj.add();
		obj.sum();
	}
}
