package Paper01B;

public class HumiditySensor implements ISensor {
	
	private String name;
	
	

	public HumiditySensor(String name) {
		super();
		this.name = name;
	}

	@Override
	public void on() {

		System.out.println("Humidity sensor switch on");
	}

	@Override
	public void off() {

		System.out.println("Humidity sensor switch off");
	}

}
