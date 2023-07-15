package Paper04A;

public abstract class Meal {
	
	IPrepareDeliciously flavour;
	IPrepareQuickly duration;
	
	public  void setFlavour(IPrepareDeliciously flavour) {
		
		this.flavour = flavour;
	} 
	
	
	public  void setDuration(IPrepareQuickly duration) {
		
		this.duration = duration;
		
	}
	
	public void mealWithFlavour() {
		
		flavour.addFlavour();
		
	}
	
	public void mealInDuration() {
		
		duration.deliveryTime();
	}
	
	public abstract void displayMeal() ;
	
	public abstract void displayCost();

}
