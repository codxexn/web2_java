package review;

public class Movie implements Runnable{

	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
			String movieTitle = Thread.currentThread().getName();
			for (int i = 0; i < 5; i++) {
				System.out.println(movieTitle + " 상영중");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(movieTitle + " 상영 종료");
				
			}
	}
	
}
