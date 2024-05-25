package lambda;

public class Test{
	
	public static void main(String[] args) {
		
		// 식과 문의 차이
		// 식은 결과가 값이다.
		// 식은 값이기 때문에 변수에 저장할 수 있고 매개변수로 넘겨줄 수 있다.
		
		// 문의 ;으로 끝난다. 명령문.
		
		// 문은 값이 아니기 때문에 변수에 저장할 수 없고 매개변수로도 넘겨줄 수 없다.
		// 문은 식을 포함할 수 있다.
		
		Lambda test = (num1, num2) -> {System.out.println(num1 + num2); return num1 + num2;};
		
		test.add(115, 22155);
		
		FunctionalInter1 test2 = number -> number + 10;
		System.out.println(test2.addTen(354));
		
	}
}
