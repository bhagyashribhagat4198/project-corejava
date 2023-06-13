package abstraction;


interface A{
	void show();	
}
interface B {
	void show();
		
}
public class TestMultipleInheritance implements A ,B{
	@Override
	public void show() {
		System.out.println("multiple inheritance");		
	}
	
public static void main(String[] args) {
	A obj =new TestMultipleInheritance();
	obj.show();
}
	
}
