package controlstatements;

public class nestedifelseexample {

	
	public static void main(String[] args) {
		int a=100, b=230, c=34;
		
		if(a>b){
			
			if(a>c){
				System.out.println("A is greatest number");
			}
			else{
				System.out.println("C is greatest number");
			}
		}
		else{
			if(b>c){
				System.out.println("B is Greatest number");
			}
			else{
				System.out.println("c is greatest number");
			}
		}
	}
}
