package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {
		ArrayList<String> alist=new ArrayList<String>();
		alist.add("white");
		alist.add("black");
		alist.add("pink");
		
		Iterator itr=alist.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
