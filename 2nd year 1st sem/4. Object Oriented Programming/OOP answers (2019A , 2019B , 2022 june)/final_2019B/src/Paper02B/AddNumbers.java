package Paper02B;

public class AddNumbers implements Runnable {
	
	private String name;
	DemoThreads lock;
	private int start;
	private int end;
	
	

	public AddNumbers( DemoThreads lock, int start, int end , String name) {
		super();
		this.name = name;
		this.lock = lock;
		this.start = start;
		this.end = end;
	}



	@Override
	public void run() {

		addNumbers(lock, start, end, name);
	}
	
	public void addNumbers(DemoThreads lock, int start, int end , String name) {
		
		synchronized(lock) {
			
			for(int i = start ; i <= end ; i++) {
				try {
					lock.wait();
					Thread.sleep(1000);
					System.out.println(this.name + " => " + i + " (+) " + i + " = " + (i+i));
					lock.notify();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
	}

}
