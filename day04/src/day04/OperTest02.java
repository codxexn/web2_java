package day04;

public class OperTest02 {
	public static void main(String[] args) {
		//복합대입연산자 : 코드를 간결하게 유지하면서 변수의 값을 업데이트
		// 산술연산자와 대입연산자를 함께 사용
		// +=, -=, *=, /=, %=
		int num1 = 10;
		int num2 = 5;
		
		System.out.println(num1);
		System.out.println(num2);

		// += : 현재 num1 값에 다른 값을 더하고 대입
		num1 += 1; //num1 = num1 + 1;
		System.out.println(num1);
		// -= : 현재 값에서 다른 값을 빼고 대입
		num1 -= num2; //num1 = num1 - num2;
		System.out.println(num1);
		
		// *= : 현재 값에서 다른 값을 곱하고 대입
		num1 *= num2; //num1 => 6, num2 => 5
		System.out.println(num1);
		
		// /= : 현재 값에서 다른 값을 나누고 대입
		num1 /= num2; //num1 => 30, num2 => 5
		System.out.println(num1);
		
		// %= : 현재 값에서 다른 값으로 나눈 나머지를 구하고 대입
		num1 %= num2; //num1 = num1 % num2;
		System.out.println(num1);
		
	}
}

















