package Paper03A;

public class MultiplyThread implements Runnable {
	
	private Object lock;
	int start;
	int range;
	
	
	
	public MultiplyThread(Object lock, int start, int range) {
		super();
		this.lock = lock;
		this.start = start;
		this.range = range;
	}
	
public void multiplyNumber(Object lock , int start , int range) {
		
		synchronized(lock) {
			
			for(int i = start ; i < range ; i++) {
				try {
					Thread.sleep(1000);
					System.out.println("Thread-1 => " + i + "*" + i + "=" + (i*i));
					lock.notify();
					lock.wait();
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		multiplyNumber(lock, start, range);
		
	}

}
