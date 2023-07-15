package Paper03A;


public class PlusThread implements Runnable {
	
	private Object lock;
	int start;
	int range;
	
	
	
	public PlusThread(Object lock, int start, int range) {
		super();
		this.lock = lock;
		this.start = start;
		this.range = range;
	}

	public void addNumber(Object lock , int start , int range) {
		
		synchronized(lock) {
			
			for(int i = start ; i < range ; i++) {
				try {
					Thread.sleep(1000);
					System.out.println("Thread-0 => " + i + "+" + i + "=" + (i+i));
					lock.wait();
					lock.notify();
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}

	@Override
	public void run() {

		addNumber(lock, start, range);
	}

}
