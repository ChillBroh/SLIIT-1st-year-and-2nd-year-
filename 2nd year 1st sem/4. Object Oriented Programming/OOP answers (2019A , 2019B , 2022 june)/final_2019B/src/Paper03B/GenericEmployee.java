package Paper03B;

import java.util.ArrayList;

public class GenericEmployee <T extends IEmployee> {
	
	
	public void showElements(ArrayList <T> obj) {
		for(T value : obj) {
			
			System.out.println(value.showEmployeeDetails());
		}
	}

}
