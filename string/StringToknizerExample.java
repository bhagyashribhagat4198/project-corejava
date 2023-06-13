package string;

import java.util.StringTokenizer;

public class StringToknizerExample {

	public static void main(String[] args) {
		
		
		StringTokenizer s=new StringTokenizer("This is String Toknizer example");
		
		while(s.hasMoreTokens()){
			System.out.println(s.nextToken());
		}	
	}	
}
