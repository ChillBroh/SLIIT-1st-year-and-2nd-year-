package Paper04B;

public class CodeFest implements IFestival {

	@Override
	public void performEvent() {

		System.out.println("Perform CodeFest Event for " + getBudget());
	}

	@Override
	public double getBudget() {
		// TODO Auto-generated method stub
		return 400000.0;
	}

}
