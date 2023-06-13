package string;

public class stringcomparisonexample {

	
	public static void main(String[] args) {
		
		
		String s="java";
		
		String s1="java";
		
		String s2=new String("java");
		
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
		
		System.out.println(s==s2);
	}
}
