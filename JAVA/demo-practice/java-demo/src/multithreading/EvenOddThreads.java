package multithreading;

public class EvenOddThreads {
// THE MAIN THREAD
	public static void main(String[] args) {
		String mainTreadName = Thread.currentThread().getName();
		System.out.println(mainTreadName + " thread");
		
	// CREATE THE EVEN THREAD
		EvenThread evenThread = new EvenThread();
		evenThread.setName("evenThread");
		String evenThreadName = evenThread.getName();
		System.out.println(evenThreadName + " thread");
		// START THE EVEN THREAD
		//evenThread.start();
//		evenThread.run();
	
		// CREATE THE ODD THREAD
		OddThread oddThread = new OddThread();
		oddThread.setName("oddThread");
		String oddThreadName = oddThread.getName();
		System.out.println(oddThreadName + " thread");
		// START THE EVEN THREAD
		//oddThread.start();
//		oddThread.run();
	}
}

class EvenThread extends Thread{
	public void run() {
		for(int i = 0; i < 100; i=i+2) {
			System.out.println("EVEN : " + i);
		}
	}
}

class OddThread extends Thread{
	public void run() {
		for(int i = 1; i < 100; i=i+2) {
			System.out.println("ODD : " + i);
		}
	}
}