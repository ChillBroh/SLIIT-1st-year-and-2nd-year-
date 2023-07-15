package Paper02A;

import java.util.ArrayList;

public class GenericPerson <T extends IPerson> {
	
	public void displayElements(ArrayList<T> obj) {
		
		for(T value : obj) {
			System.out.println(value.displayDetails());;
			
		}
	}

}
