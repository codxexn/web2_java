package tvTest;

public class MainTest {
	public static void main(String[] args) {
		Tv tv1 = new Tv();
		System.out.println(tv1);
		tv1.ch = 5;
		tv1.chUp();
//		tv1.mode();
		
		Tv2 tv2 = new Tv2();
		System.out.println(tv2);
		tv2.mode();
		
		SmartTv sTv = new SmartTv();
		System.out.println(sTv);
		sTv.netflix();

	}
}
