package Question01A;


public class Squirrel extends Pet {
	
	private String command;
	
	

	public Squirrel(String command) {
		super();
		this.command = command;
	}

	@Override
	public void GetTotalPoints() {

		if(isCaught() == true) {
			setter(0);
		}
		else
			System.out.println("Total point is " + getters());
	}

	public void feed() {
		System.out.println("feeding the Squirrel");
		setter(getters()+5);
	}

	public void clean() {

		System.out.println("cleanig the Squirrel");
		setter(getters() + 10);
	}

	public void cuddle() {

		System.out.println("cuddling the Squirrel");
		setter(getters() + 15);

	}
	
	public boolean isCaught()  {
		try {
			if(this.command.length() == 4 && this.command.equalsIgnoreCase("Run5")) {
				
				throw new CaughtException("Caught");
				
			}
			else
				System.out.println("Not caught");
		} catch (CaughtException e) {
			System.out.println(e);
			return true;
		}
		
		return false;
	}
}
