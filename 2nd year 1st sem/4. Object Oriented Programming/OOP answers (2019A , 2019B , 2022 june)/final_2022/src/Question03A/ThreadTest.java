package Question03A;

import java.util.ArrayList;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> 	queue = new ArrayList<>();
		
		Thread producer = new Thread(new ProducerThread(queue));
		Thread consumer = new Thread(new ConsumerThread(queue));
		
		producer.start();
		consumer.start();
		
		System.out.println("Starting	");

	}

}
