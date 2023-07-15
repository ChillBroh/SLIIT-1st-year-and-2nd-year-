package Paper04B;

public class GameFest implements IFestival {

	@Override
	public void performEvent() {

		System.out.println("Perform GameFest Event for " + getBudget());
	}

	@Override
	public double getBudget() {
		// TODO Auto-generated method stub
		return 300000.0;
	}

}
