package Paper04A;

public class FishFlavour implements IPrepareDeliciously {

	@Override
	public void addFlavour() {

		System.out.println("Added Fish for the meal");
	}

	@Override
	public double getCost() {

		return 80.0 ;
	}

}
