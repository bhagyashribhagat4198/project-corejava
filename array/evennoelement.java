package array;

public class evennoelement {

public static void main(String[] args) {
		
		int a[]={12,45,67,34,90};
		for(int i=0;i<a.length;i=i+2){
			System.out.println("Even position elements "+i+" "+a[i]);
		}
}
}