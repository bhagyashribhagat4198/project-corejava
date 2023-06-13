package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap hmap=new HashMap();
		hmap.put(1, "one");
		hmap.put(2, "two");
		hmap.put(3, "three");
		hmap.put(4, "four");
		
		Set set=hmap.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext()){
			Map.Entry e=(Entry) itr.next();
			System.out.println(e.getKey()+" "+e.getValue() );
		}
	}
}
