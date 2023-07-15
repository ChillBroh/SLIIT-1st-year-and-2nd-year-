package Paper04B;

public abstract class Student {
	
	IProgram Program;
	IFestival Festival;
	
	public void setProgram(IProgram program) {
		Program = program;
	}
	
	public void setFestival(IFestival festival) {
		Festival = festival;
	}
	
	public void offerPrograms() {
		
		Program.offerProgram();
		
	}
	
	public void conductEvent() {
		
		Festival.performEvent();
		
	}
	
	public abstract void displayStudents();
	
	public abstract void displayCost();
	
	

}
