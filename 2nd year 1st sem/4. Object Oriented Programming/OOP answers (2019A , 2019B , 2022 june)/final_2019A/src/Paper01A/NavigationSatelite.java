package Paper01A;

public class NavigationSatelite implements ISatelite {
	
	private String name;
	
	public NavigationSatelite(String name) {
		this.name = name;
	}

	@Override
	public void activate() {
		// TODO Auto-generated method stub
		System.out.println(this.name + " navigational satelite activate");

	}

	@Override
	public void deactivate() {
		// TODO Auto-generated method stub
		System.out.println(this.name + " navigational satelite deactivate");

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
