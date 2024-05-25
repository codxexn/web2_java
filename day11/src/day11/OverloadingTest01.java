package day11;

public class OverloadingTest01 {

	public int add(int number1, int number2) {
		return number1 + number2;
	}
	
	public int add(int number1, int number2, int number3) {
		return number1 + number2 + number3;
	}
	
	
	public static void main(String[] args) {

		OverloadingTest01 ot = new OverloadingTest01();
		
		System.out.println(ot.add(1456, 6654));
		System.out.println(ot.add(1456, 6654, 7987));
		
		
		
	}

}
