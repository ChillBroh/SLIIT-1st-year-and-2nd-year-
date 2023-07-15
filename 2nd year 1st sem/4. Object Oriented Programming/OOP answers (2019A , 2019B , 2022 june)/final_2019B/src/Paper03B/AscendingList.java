package Paper03B;

import java.util.SortedSet;
import java.util.TreeSet;

public class AscendingList <T> {
	
	TreeSet<T> treeset = new TreeSet<T>();
	
	public void add(T t) {
		
		treeset.add(t);
	}
	
	public void displayMyList(AscendingList<T> list) {
		
		for(T value: list.treeset) {
			
			System.out.println(value);
		}
		
	}

}
