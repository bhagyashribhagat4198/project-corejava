package collection;

import java.util.LinkedHashSet;

public class LinkedhashSetExample {

	
	public static void main(String[] args) {
	
		LinkedHashSet<String> lset=new LinkedHashSet<String>();
		
		lset.add("one");
		lset.add("1");
		lset.add("two");
		lset.add("2");
		lset.add("1");
		System.out.println(lset);
	}
}
