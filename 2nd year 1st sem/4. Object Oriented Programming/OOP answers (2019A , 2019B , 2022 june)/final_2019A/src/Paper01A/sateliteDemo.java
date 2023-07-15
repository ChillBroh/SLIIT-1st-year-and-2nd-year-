package Paper01A;

public class sateliteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ISatelite navigationalSatelite = new NavigationSatelite("Ravana-01");
		IGeoLocation locationTracker1 = new SateliteLocation("Sri-Lanka");
		ISatelite droneSatelite = new DroneSatelite("Ravana-02");
		IGeoLocation locationTracker2 = new SateliteLocation("Russia");
		
		ISatelite[] sateliteArray = new ISatelite[] {navigationalSatelite,droneSatelite};
		IGeoLocation[] igeoLocation = new IGeoLocation[] {locationTracker1,locationTracker2};
		
		SateliteCenter sateliteCenter = new SateliteCenter(0, sateliteArray, igeoLocation);
		sateliteCenter.StartService();
		sateliteCenter.stopService();
		sateliteCenter.locationService();
		
		System.out.println();
		
		SateliteCenter remoteController2 = new SateliteCenter(1, sateliteArray, igeoLocation);
		remoteController2.StartService();
		remoteController2.stopService();
		remoteController2.locationService();

	}

}
