package Question04A;

public class ToyotaCar implements Car {
	
	CarAirBag airBag ;
	
	

	public ToyotaCar(CarAirBag airBag) {
		super();
		this.airBag = airBag;
	}

	@Override
	public void assembleLight() {
		System.out.println("Assembling for Toyota");
		airBag.airBagLightIndecator();

	}

	@Override
	public void assembleMotionSensor() {

		System.out.println("Assembling for Toyota");
		airBag.airBagMotionDetection();
	}

}
