package Paper04B;

public class UnderGraduateStudent extends Student {

	@Override
	public void displayStudents() {

		super.offerPrograms();
		super.conductEvent();
		displayCost();
		System.out.println("Display UnderGraduate Strudent");
	}

	@Override
	public void displayCost() {

		System.out.println("Cost for the undergraduate program is = " + Program.getCost() );
	}

}
