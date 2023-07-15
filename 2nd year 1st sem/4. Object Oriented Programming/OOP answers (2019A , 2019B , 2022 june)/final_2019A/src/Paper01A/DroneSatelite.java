package Paper01A;

public class DroneSatelite implements ISatelite {
	
	private String name;
	
	public DroneSatelite(String name) {
		
		this.name = name;
	}

	@Override
	public void activate() {
		// TODO Auto-generated method stub
		System.out.println(this.name + " drone satelite activate");

	}

	@Override
	public void deactivate() {
		// TODO Auto-generated method stub
		System.out.println(this.name + " drone satelite deactivate");

	}

}
