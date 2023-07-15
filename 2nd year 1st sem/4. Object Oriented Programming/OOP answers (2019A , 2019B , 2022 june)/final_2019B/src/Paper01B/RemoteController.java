package Paper01B;

public class RemoteController {

	private int Switch;

	private ISensor[] ISensor;
	private IMotionTracker[] IMotionTracker;

	public RemoteController(int switch1, Paper01B.ISensor[] iSensor, Paper01B.IMotionTracker[] iMotionTracker) {
		super();
		Switch = switch1;
		ISensor = iSensor;
		IMotionTracker = iMotionTracker;
	}

	public void startService() {

		if(this.Switch == 0) 
			ISensor[0].on();
		else
			ISensor[1].on();
	}

	public void stopService() {

		if(this.Switch == 0) 
			ISensor[0].off();
		else
			ISensor[1].off();

	}

	public void locationService() {


		if(this.Switch == 0) IMotionTracker[0].displayLocation(); else
			IMotionTracker[0].displayLocation();


	}



}
