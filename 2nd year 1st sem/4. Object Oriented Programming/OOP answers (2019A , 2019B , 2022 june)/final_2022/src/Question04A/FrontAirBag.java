package Question04A;

public class FrontAirBag implements CarAirBag {

	@Override
	public void airBagMotionDetection() {

		System.out.println("Motion detection on for Front Air Bag");
	}

	@Override
	public void airBagLightIndecator() {

		System.out.println("Light Indicator on for Front Air Bag");
	}

}
