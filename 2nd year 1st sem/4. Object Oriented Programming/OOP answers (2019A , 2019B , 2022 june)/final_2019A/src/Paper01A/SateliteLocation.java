package Paper01A;

public class SateliteLocation implements IGeoLocation {
	
	String Location;
	
	

	public SateliteLocation(String location) {
		super();
		Location = location;
	}
	
	



	public String getLocation() {
		return Location;
	}





	public void setLocation(String location) {
		Location = location;
	}





	@Override
	public void displayLocation() {
		// TODO Auto-generated method stub
		System.out.println("Satelite Location is = " + this.Location);

	}

}
