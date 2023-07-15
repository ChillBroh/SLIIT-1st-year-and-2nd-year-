package Question04A;

public class NissanCar implements Car {
	
	CarAirBag airBag ;
	
	

	public NissanCar(CarAirBag airBag) {
		super();
		this.airBag = airBag;
	}

	@Override
	public void assembleLight() {
		System.out.println("Assembling for Nissan");
		airBag.airBagLightIndecator();
	}

	@Override
	public void assembleMotionSensor() {
		System.out.println("Assembling for Nissan");
		airBag.airBagMotionDetection();
		
	}

}
