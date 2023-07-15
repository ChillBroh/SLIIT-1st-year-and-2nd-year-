package Paper01B;

public class SensorLocation implements IMotionTracker {
	
	private String location;
	
	

	public SensorLocation(String location) {
		super();
		this.location = location;
	}



	@Override
	public void displayLocation() {

		System.out.println("Sensor Location is = " + this.location);
	}

}
