package nestedclass;

public class MemberInnerClassExample {

	int i=10;
	
	class show{
		
		void info(){
			System.out.println("inner class method ");
		}
	}
	public static void main(String[] args) {
		
		MemberInnerClassExample obj =new MemberInnerClassExample();// outer class object
		
		MemberInnerClassExample.show s= obj.new show();// create inner class object 
		
		s.info();
	}
}
