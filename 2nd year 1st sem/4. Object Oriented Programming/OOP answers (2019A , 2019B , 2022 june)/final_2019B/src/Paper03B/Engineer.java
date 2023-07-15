package Paper03B;

public class Engineer implements IEmployee {
	
	String employeeID;
	String company;
	
	

	public Engineer(String employeeID, String company) {
		super();
		this.employeeID = employeeID;
		this.company = company;
	}



	@Override
	public String showEmployeeDetails() {

		String s = "Engineer = " + this.employeeID + ", Company = " + this.company;
		return s;
	}

}
