package Question04A;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CarAirBag fAirBag = new FrontAirBag();
		CarAirBag sAirBag = new SideAirBag();
		
		new NissanCar(fAirBag).assembleLight();
		new NissanCar(fAirBag).assembleMotionSensor();
		new NissanCar(sAirBag).assembleMotionSensor();
		
		new ToyotaCar(fAirBag).assembleLight();
		new ToyotaCar(fAirBag).assembleMotionSensor();
		new ToyotaCar(sAirBag).assembleLight();
		new ToyotaCar(sAirBag).assembleMotionSensor();

	}

}
