package Paper02A;

public class Lecturer implements IPerson {
	
	String employeeID;
	String department;
	
	

	public Lecturer(String employeeID, String department) {
		super();
		this.employeeID = employeeID;
		this.department = department;
	}
	
	



	public String getEmployeeID() {
		return employeeID;
	}


	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String displayDetails() {
		// TODO Auto-generated method stub
		String s = "ID :" + this.employeeID + " Department : " + this.department;

		return s;
	}

}
