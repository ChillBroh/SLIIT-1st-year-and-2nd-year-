package Paper02A;

import java.util.Map;
import java.util.TreeMap;

public class AscendingTable <T , E> {
	
	Map<T , E > treemap = new TreeMap<>();

	public void add(T t , E e) {
		
		treemap.put(t, e);
	}
	
	
	public static <T,E> void display(AscendingTable<T,E> table) {
		
		for(Map.Entry<T,E> entry : table.treemap.entrySet()) {
			
			System.out.println(entry.getKey() + ", " + entry.getValue());
		}
	}

}
