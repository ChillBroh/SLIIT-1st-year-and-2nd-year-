package Question01A;

public class Parrot extends Pet {
	
	private String command;
	
	

	public Parrot(String command) {
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
		System.out.println("feeding the Parrot");
		setter(getters()+5);
	}

	public void clean() {
		
		System.out.println("cleanig the Parrot");
		setter(getters() + 10);
	}

	public void cuddle() {
		
		System.out.println("cuddling the Parrot");
		setter(getters() + 15);
		
	}
	
	public boolean isCaught() {
		
		try {
			
			if(this.command.length() == 4 && this.command.equalsIgnoreCase("Walk")) {
				throw new CaughtException("caught");
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
