package Paper03B;

public class Manager implements IEmployee {
	
	String managerID;
	double salary;
	
	

	public Manager(String managerID, double salary) {
		super();
		this.managerID = managerID;
		this.salary = salary;
	}



	@Override
	public String showEmployeeDetails() {

		String s = "Manager ID = " + this.managerID + " , Salary = " + this.salary;
		return s;
	}

}
