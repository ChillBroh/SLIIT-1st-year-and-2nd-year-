package Paper02B;

public class MultiplyNumbers implements Runnable {
	
	private String name;
	DemoThreads lock;
	private int start;
	private int end;
	
	

	public MultiplyNumbers(DemoThreads lock, int start, int end , String name) {
		super();
		this.name = name;
		this.lock = lock;
		this.start = start;
		this.end = end;
	}



	@Override
	public void run() {

		multiplyNumbers(lock, start, end, name);
	}
	
public void multiplyNumbers(DemoThreads lock, int start, int end , String name) {
		
		synchronized(lock) {
			
			for(int i = start ; i <= end ; i++) {
				try {
					Thread.sleep(1000);
					System.out.println(this.name + " => " + i + " (*) " + i + " = " + (i*i));
					lock.notify();
					lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
	}

}
