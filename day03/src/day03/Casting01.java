package day03;

public class Casting01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정수 -> 정수
		int num1 = (int)3L; //강제 형변환
		long num2 = 100; //자동 형변환(더 큰 저장공간에 작은 값이 들어감)
		System.out.println(num1);
		System.out.println(num2);
		
		//실수 -> 실수
		float num3 = (float)3.0; //강제 형변환
		double num4 = 3.14f; //자동 형변환(더 큰 저장공간에 작은 값이 들어감)
		System.out.println(num3);
		System.out.println(num4);
		
		//정수 -> 실수
		float num5 = 99999999999L; //자동 형변환
		double num6 = 3; //자동 형변환
		System.out.println(num5);
		System.out.println(num6);
		
		//실수 -> 정수
		int num7 = (int)3.0; // 강제 형변환(소수점 이하의 값들이 손실되기 때문에)
		long num8 = (long)3.14F; //강제 형변환
		System.out.println(num7);
		System.out.println(num8);

		//자동형변환
		//1) 정수 + 정수 = 정수
		int number1 = 10;
		int number2 = 20;
		System.out.println(number1 + number2); //숫자 + 숫자 = 연산결과
		//2) 실수 + 실수 = 실수
		double number3 = 3.5;
		double number4 = 5.11;
		System.out.println(number3 + number4);
		System.out.printf("%f + %f = %f\n", number3, number4, number3 + number4);
		//3) 정수 + 실수 = 실수
		System.out.println(number1 + number4);
	
	}

}




















