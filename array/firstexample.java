package array;

public class firstexample {

	public static void main(String[] args) {
		int a[]=new int[5];
		a[0]=12;
		a[1]=34;
		a[2]=45;
		a[3]=56;
		a[4]=78;
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		System.out.println("_--------------------------------");
		int b[]={12,4,5,6};
		for(int j=0;j<b.length;j++){
			System.out.println(b[j]);
		}
	}
}
