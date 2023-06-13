package collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	
	public static void main(String[] args) {
		
		TreeMap<Integer,String> tmap=new TreeMap<Integer,String>();
		
		tmap.put(110, "vijay");
		tmap.put(100, "sanjay");
		tmap.put(104, "sachin");
		tmap.put(117, "priya");
		for(Map.Entry m:tmap.entrySet()){
			System.out.println(m.getKey() +" "+m.getValue());
			
		}
	}
	
	

}
