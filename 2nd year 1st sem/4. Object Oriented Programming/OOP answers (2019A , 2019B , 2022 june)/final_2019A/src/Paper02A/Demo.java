package Paper02A;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> students = new ArrayList<>(); 
		students.add(new Student("STD111" ,  6)); 
		students.add(new Student("STD222" ,  7)); 
		students.add(new Student("STD333" ,  11)); 
		students.add(new Student("STD444" ,  12	)); 
		students.add(new Student("STD555" ,  10)); 
		
		ArrayList<Lecturer> lecturers = new ArrayList<>(); 
		lecturers.add(new Lecturer("EMP111", "IT"));
		lecturers.add(new Lecturer("EMP222", "SE"));
		lecturers.add(new Lecturer("EMP333", "CSN"));
		lecturers.add(new Lecturer("EMP444", "EE"));
		lecturers.add(new Lecturer("EMP555", "IS"));
		
		GenericPerson genericPerson = new GenericPerson();
		genericPerson.displayElements(students);
		genericPerson.displayElements(lecturers);
	}

}
