package Paper04A;

public class Lunch extends Meal {

	@Override
	public void displayMeal() {

		System.out.println("Preparing Lunch.........");
		super.mealWithFlavour();
		super.mealInDuration();
		displayCost();
	}

	@Override
	public void displayCost() {

		System.out.println("Cost for the meal is = " + flavour.getCost() );
	}

}
