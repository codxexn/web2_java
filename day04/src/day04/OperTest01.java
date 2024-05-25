package day04;

public class OperTest01 {
	public static void main(String[] args) {
		//산술연산자
		int num1 = 10, num2 = 20;
		double num3 = 5.1, num4 = 3.1;
		
		System.out.println(num1 + num2); //정수 + 정수 = 정수
		System.out.println(num3 + num4); //실수 + 실수 = 실수
		System.out.println(num1 - num2); //정수 - 정수 = 정수
		System.out.println(num2 - num3); //정수 - 실수 = 실수
		
		System.out.println(num1 * num2);
		System.out.println(num3 * num4);
		
		System.out.println(num1 / num2); //10 / 20 = 0(몫)
		System.out.println(num3 / num4); //실수 / 실수 = 나눗셈 그자체(실수)
		
		System.out.println(10 % 3);//정수 % 정수 = 나머지(정수)
		System.out.println(10.0 % 3.0);//실수 % 실수 = 나머지(실수)
		System.out.println(10 % 3.0); //정수 % 실수 = 나머지(실수)
	}
}








