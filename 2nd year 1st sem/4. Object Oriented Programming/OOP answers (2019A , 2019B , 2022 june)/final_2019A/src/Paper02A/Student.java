package Paper02A;

public class Student implements IPerson {
	
	String studentID;
	int grade;
	
	

	public Student(String studentID, int grade) {
		super();
		this.studentID = studentID;
		this.grade = grade;
	}
	
	



	public String getStudentID() {
		return studentID;
	}





	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}





	public int getGrade() {
		return grade;
	}





	public void setGrade(int grade) {
		this.grade = grade;
	}





	@Override
	public String displayDetails() {
		// TODO Auto-generated method stub
		String s = "Student ID : " + this.studentID + " Grade: " + this.grade;

		return s;
	}

}
