package Paper04B;

public class RoboFest implements IFestival {

	@Override
	public void performEvent() {

		System.out.println("Perform RoboFest Event for " + getBudget());
	}

	@Override
	public double getBudget() {
		// TODO Auto-generated method stub
		return 800000.0;
	}

}
