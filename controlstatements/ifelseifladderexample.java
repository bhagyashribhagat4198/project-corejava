package controlstatements;

public class ifelseifladderexample {

	public static void main(String[] args) {
		int number =1234;
		
		if(number<100 && number>=10){
			System.out.println("Number is 2 digit ");
		}
		else if(number <1000 && number>=100){
			System.out.println("Number is 3 digit ");
		}
		else if(number <10000 && number>=1000){
			System.out.println("Number is 4 digit ");
		}
		else if(number<100000 && number>=10000){
			System.out.println("Number is 5 digit");
		}
		else{
			System.out.println("Number is out of range");
		}
	}
}
