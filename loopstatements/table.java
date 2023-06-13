package loopstatements;

import java.util.Scanner;

public class table {

	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		
		int number=scan.nextInt();
		
		for(int i=1;i<=10;i++){
			System.out.println(number+" "+"*"+" "+i+" "+"="+number*i);
		}
	}
}

