package synchronizationTest;

public class InterruptedTest implements Runnable{

	@Override
	public void run() {
		// .interrupted() 메소드는 한번 사용하면  false로 바뀐다.
		System.out.println(Thread.interrupted());
		System.out.println(Thread.interrupted());
	
		for (int i = 0; i < 10; i++) {
			// 쓰레드 중단하고 싶을 때 사용하는 것
			if (Thread.interrupted()) {
				System.out.println("인터럽트 발생");
				break;
			}
			System.out.println(i);
		}
		
	
	
	}
	
	
	
	
	
	
}
