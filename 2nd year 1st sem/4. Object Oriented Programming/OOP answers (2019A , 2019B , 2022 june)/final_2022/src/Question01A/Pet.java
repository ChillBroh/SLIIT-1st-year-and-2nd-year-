package Question01A;

public abstract class Pet implements PointAllocator {
	
	private double point;

	@Override
	public void setter(double points) {

		this.point = points;
	}

	@Override
	public double getters() {
		// TODO Auto-generated method stub
		return this.point;
	}
	
	public abstract void feed();
	
	public abstract void clean();
	
	public abstract void cuddle();
	
	public abstract void GetTotalPoints();

}
