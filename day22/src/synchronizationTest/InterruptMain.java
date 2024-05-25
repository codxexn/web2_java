package synchronizationTest;

public class InterruptMain {
	public static void main(String[] args) {
		
		InterruptedTest it = new InterruptedTest();
		
		Thread t1 = new Thread(it);
		
		t1.start();
		t1.interrupt();
//		t1.start();
		
		
		
		
		
		
	}
}
