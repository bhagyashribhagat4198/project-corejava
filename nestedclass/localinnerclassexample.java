package nestedclass;

public class localinnerclassexample {

	
	int i=10;
	void show(){
		
		class innerclass{
			
			void info(){
				System.out.println(i);
			}
		}
		innerclass obj=new innerclass();
		obj.info();
	}
	public static void main(String[] args) {
		localinnerclassexample l=new localinnerclassexample();
		l.show();
	}
}
