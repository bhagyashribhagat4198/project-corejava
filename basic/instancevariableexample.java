package basic;

public class instancevariableexample {

	int a=45, b=30;  // instance variable
	int c;
	
	void add(){
		c=a+b;
		System.out.println("Addition = "+c);
	}
	void substract(){
		c=a-b;
		System.out.println("Substraction = "+c);
	}
	void multiply(){
		
	}
	void divide(){
		
	}
	public static void main(String args[]){
		instancevariableexample obj =new instancevariableexample();
		obj.add();
		obj.substract();
	}
}
