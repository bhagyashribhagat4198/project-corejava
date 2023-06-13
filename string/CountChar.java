package string;

public class CountChar {

	
	public static void main(String[] args) {
		
		String s="this is first string program";
		int count =0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' '){
				count++;
			}
		}
		
		System.out.println("Total Char in String are "+count);
	}
}
