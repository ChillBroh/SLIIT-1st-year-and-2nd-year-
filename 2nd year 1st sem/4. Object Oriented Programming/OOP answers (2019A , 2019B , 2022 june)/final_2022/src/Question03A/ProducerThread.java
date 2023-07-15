package Question03A;

import java.util.ArrayList;

public class ProducerThread implements Runnable {
	
	private ArrayList<Integer> array;
	
	

	public ProducerThread(ArrayList<Integer> array) {
		super();
		this.array = array;
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		int x = 10 ;
		
		while(true) {
			synchronized(array) {
				try {
					System.out.println("producer started");
					array.add(x);
					
					System.out.println("Producer adding value = " + x + " to queue");
					x += 10;
					Thread.sleep(1000);
					array.wait();
					array.notify();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}

	}

}
