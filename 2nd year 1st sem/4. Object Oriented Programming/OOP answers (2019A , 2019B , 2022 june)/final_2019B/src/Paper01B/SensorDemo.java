package Paper01B;

public class SensorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ISensor humaditySensor = new HumiditySensor("Humadity");
		IMotionTracker humadityTracker = new SensorLocation("Colombo");
		ISensor rainfallSensor = new RainFallSensor("Rain Fall");
		IMotionTracker rainfallTracker = new SensorLocation("Kandy");
		
		ISensor[] sensorArray= new ISensor[] {humaditySensor, rainfallSensor};
		IMotionTracker[] trackerArray = new IMotionTracker[] {humadityTracker, rainfallTracker};
		
		RemoteController remoteController = new RemoteController(0, sensorArray, trackerArray);
		remoteController.startService();
		remoteController.stopService();
		remoteController.locationService();
		
		System.out.println();
		
		RemoteController remoteController1 = new RemoteController(1, sensorArray, trackerArray);
		remoteController1.startService();
		remoteController1.stopService();
		remoteController1.locationService();

	}

}
