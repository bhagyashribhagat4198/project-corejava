package inheritance;

class Shape{
	void draw(){
		System.out.println("Drawing shape");
	}
}
public class Square  extends Shape{

	void info(){
		System.out.println("Square class method");
	}
	public static void main(String[] args) {
		Square obj =new Square();
		obj.info();
		obj.draw();
	}
}
