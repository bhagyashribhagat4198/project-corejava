package loopstatements;

public class reversenumber {

	public static void main(String[] args) {
		int number =1234321;
		int reverse=0;
		int temp =number;
		System.out.println("Original Number = "+number);
		while(number>0){
			int remainder=number%10;
			reverse=reverse*10+remainder;
			number=number/10;
			
		}
		System.out.println("Reverse of number ="+reverse);
		if(temp==reverse){
			System.out.println("Number is pallindrom ");
		}
		else{
			System.out.println("number is not pallindrom");
		}
	}
}

