package collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		
		
		LinkedHashMap<Integer,String> lmap=new LinkedHashMap<Integer,String>();
		
		lmap.put(1, "java");
		lmap.put(2, "os");
		lmap.put(3, "C");
		lmap.put(4, "c++");
		
		for(Map.Entry m:lmap.entrySet()){
			System.out.println(m.getKey() +" "+m.getValue());
			
		}
	}
}
