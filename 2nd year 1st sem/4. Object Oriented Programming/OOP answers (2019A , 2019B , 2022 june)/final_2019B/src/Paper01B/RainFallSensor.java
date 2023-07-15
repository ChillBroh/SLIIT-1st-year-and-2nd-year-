package Paper01B;

public class RainFallSensor implements ISensor {
	
	private String name;
	
	

	public RainFallSensor(String name) {
		super();
		this.name = name;
	}

	@Override
	public void on() {

		System.out.println("Rain Fall sensor switch on");
	}

	@Override
	public void off() {

		System.out.println("Rain Fall sensor switch off");
	}

}
