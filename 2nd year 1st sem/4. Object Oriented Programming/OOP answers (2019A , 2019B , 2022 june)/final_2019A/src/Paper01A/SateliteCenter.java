package Paper01A;

public class SateliteCenter {
	
	private int option;
	private ISatelite[] ISatelite;
	private IGeoLocation[] IGeoLocation;
	
	public SateliteCenter(int option, ISatelite[] iSatelite, IGeoLocation[] iGeoLocation) {
		super();
		this.option = option;
		ISatelite = iSatelite;
		IGeoLocation = iGeoLocation;
	}

	public int getOption() {
		return option;
	}

	public void setOption(int option) {
		this.option = option;
	}

	public ISatelite[] getISatelite() {
		return ISatelite;
	}

	public void setISatelite(ISatelite[] iSatelite) {
		ISatelite = iSatelite;
	}

	public IGeoLocation[] getIGeoLocation() {
		return IGeoLocation;
	}

	public void setIGeoLocation(IGeoLocation[] iGeoLocation) {
		IGeoLocation = iGeoLocation;
	}
	
	
	
	public void StartService() {
		
		if(this.option == 0) {
			ISatelite[0].activate();
		}
		else {
			ISatelite[1].activate();
		}
		
	}
	
	public void stopService() {
		
		if(this.option == 0) {
			ISatelite[0].deactivate();;
		}
		else {
			ISatelite[1].deactivate();
		}
	}
	
	public void locationService() {
		
		if(this.option == 0) {
			IGeoLocation[0].displayLocation();;
		}
		else {
			IGeoLocation[1].displayLocation();;
		}
		
	}
	
	

}
