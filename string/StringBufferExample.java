package string;

public class StringBufferExample {

	
	public static void main(String[] args) {
		
		String s="java";
		s.concat("program");
		StringBuffer str=new StringBuffer("java");
		
		str.append("program");
		System.out.println(s);
		System.out.println(str);
	}
	
	
	
}
