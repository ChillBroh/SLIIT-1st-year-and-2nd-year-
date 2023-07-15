package Paper04B;

public class TestStratergy {

	public static void main(String[] args) {

		Student poStudent = new PostGraduateStudent();
		poStudent.setFestival(new CodeFest());
		poStudent.setProgram(new MscPrograms());
		poStudent.displayStudents();
		
		System.out.println();
		
		Student unStudent = new UnderGraduateStudent();
		unStudent.setFestival(new RoboFest());
		unStudent.setProgram(new BscPrograms());
		unStudent.displayStudents();
	}

}
