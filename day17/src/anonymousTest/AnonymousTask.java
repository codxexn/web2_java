package anonymousTest;

public class AnonymousTask{

	public void calcAdd(CalculatorImpl calculatorImpl, int num1, int num2) {
		calculatorImpl.add(num1, num2);
	}
	
	public static void main(String[] args) {
		
		AnonymousTask at = new AnonymousTask();
		
		
		
		at.calcAdd(new CalculatorImpl() {
			@Override
			public int add(int num1, int num2) {
				System.out.println(num1 + num2);
				return num1 + num2;
			}
		}, 10, 20);
		
		
		
	}
}
