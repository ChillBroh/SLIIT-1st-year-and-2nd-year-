package Question03A;

import java.util.ArrayList;

public class ConsumerThread implements Runnable {
	
	private ArrayList<Integer> array = new ArrayList<>();
	
	

	public ConsumerThread(ArrayList<Integer> array) {
		super();
		this.array = array;
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true) {
			synchronized(array) {
				try {
					System.out.println("Consumer started");
					System.out.println("Consumer Thread consume " + array.get(0) );
					array.remove(0);
					System.out.println("Elements in queue = " + array );
					Thread.sleep(1000);
					array.notify();
					array.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}

	}

}
