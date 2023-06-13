package polymorphism;

public class Summation {
	void add(){
		int a=10, b=20;
		int sum =a+b;
		System.out.println(sum);
	}
	void add(int n){
		int sum =n+n;
		System.out.println(sum);
	}	
	void add(int p , int q){
		int sum =p+q;
		System.out.println(sum);
	}	
	void add(float x){
		float sum=x+x;
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		Summation obj =new Summation();
		obj.add(23);
		obj.add(34.56f);
		obj.add(45,67);
		obj.add();
	}
	}

