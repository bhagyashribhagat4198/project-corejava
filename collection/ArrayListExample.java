package collection;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String>  alist=new ArrayList<String>();
		alist.add("one");
		alist.add("two");
		alist.add("three");
		alist.add("four");
		alist.add("five");
		alist.add("six");
		alist.add("five");		
		System.out.println(alist);
		System.out.println("---------------For loop------------------");
		// print using for loop
		for(int i=0;i<alist.size();i++){
			System.out.println(alist.get(i));
		}
		System.out.println("---------------For Each Loop------------------");
		// for each loop
	
	for(String a:alist){
		System.out.println(a);
	}
	System.out.println("----------------Remove Method----------------");
	//	alist.remove(2);
		alist.remove("three");
		System.out.println(alist);
		System.out.println("----------------size Method----------------");
		System.out.println(alist.size());
		
		System.out.println("----------------Contains Method----------------");
		System.out.println(alist.contains("ten"));
	}
	
}
