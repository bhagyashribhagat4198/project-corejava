package accessmodifiers;

public class privateexample {
	
	private int data=10;
	
	private void show(){
		System.out.println(data);
	}
	public static void main(String[] args) {
		privateexample obj =new privateexample();
		obj.show();
	}
}
