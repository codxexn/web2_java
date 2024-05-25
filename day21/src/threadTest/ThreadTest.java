package threadTest;

public class ThreadTest {
	public static void main(String[] args) {
		
		MyThread t1 = new MyThread("#");
		MyThread t2 = new MyThread("★");
		
		// main 쓰레드가 시키는 것
//		t1.run();
//		t2.run();
		
		// 다른 쓰레드가 시키는 것
		t1.start();
		t2.start();
		
//		for (int i = 0; i < 10; i++) {
//			System.out.println(Thread.currentThread().getName());
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		
	}
}
