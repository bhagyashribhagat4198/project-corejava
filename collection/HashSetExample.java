package collection;

import java.util.HashSet;

public class HashSetExample {

	
	public static void main(String[] args) {
		
		HashSet<String> hset= new HashSet<String>();
		hset.add("sachin");
		hset.add("priya");
		hset.add("ajay");
		hset.add("virat");
		hset.add("priya");
		System.out.println(hset);
	}
}
