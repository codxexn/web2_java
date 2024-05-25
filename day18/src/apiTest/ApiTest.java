package apiTest;

public class ApiTest {
	public static void main(String[] args) {
		
		Calc calc = new Calc();
		
		try {
			System.out.println(calc.divide(3, 0));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
