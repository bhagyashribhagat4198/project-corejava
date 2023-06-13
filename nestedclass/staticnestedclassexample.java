package nestedclass;

public class staticnestedclassexample {

	static int i =10;
	
	static class test{
		void display(){
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		staticnestedclassexample.test obj =new staticnestedclassexample.test();
		obj.display();
	}
}
