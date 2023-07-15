package Paper03B;

import java.util.ArrayList;

public class GenericEmployeeDemo {

	public static void main(String[] args) {

		ArrayList<Engineer> engineers = new ArrayList<>();
		engineers.add(new Engineer("E000", "IFS"));
		engineers.add(new Engineer("E111", "Virtusa"));
		engineers.add(new Engineer("E222", "99x"));
		engineers.add(new Engineer("E333", "Cambio"));
		engineers.add(new Engineer("E444", "CodeGen"));
		
		ArrayList<Manager> manager = new ArrayList<>();
		manager.add(new Manager("MGD555", 250000.0));
		manager.add(new Manager("MGD444", 225000.0));
		manager.add(new Manager("MGD333", 175000.0));
		manager.add(new Manager("MGD222", 200000.0));
		manager.add(new Manager("MGD111", 150000.0));
		
		GenericEmployee genericEmployee = new GenericEmployee();
		genericEmployee.showElements(engineers);
		System.out.println();
		genericEmployee.showElements(manager);
		
	}

}
