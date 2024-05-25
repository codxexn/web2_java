package review;

public class JavaCinema {
	public static void main(String[] args) {
		
		Movie m1 = new Movie();
		Thread t1 = new Thread(m1, "서울의 봄");
		Thread t2 = new Thread(m1, "나폴레옹");
		Thread t3 = new Thread(m1, "3일의 휴가");
		
		t1.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t2.start();
		t3.start();
		
	}
}
