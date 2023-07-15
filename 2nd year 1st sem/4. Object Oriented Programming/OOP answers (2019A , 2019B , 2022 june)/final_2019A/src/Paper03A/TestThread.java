package Paper03A;

public class TestThread {

	public static void main(String[] args) {

		Object lock = new Object();
		
		Thread threadPlus = new Thread(new PlusThread(lock, 2, 10));
		Thread threadMultiply = new  Thread(new MultiplyThread(lock, 2, 10));
		
		threadPlus.start();
		threadMultiply.start();
		
	}

}
