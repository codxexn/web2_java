package day04;

import java.util.Scanner;

public class InputTest01 {
	public static void main(String[] args) {
		// 두 정수를 입력받고 합을 출력하기
		// next()메소드를 사용한다
		
		// 정수1 입력 : 
		// 정수2 입력 : 
		// 두 정수의 합은 __입니다
		
		//1. 입력클래스 불러온다
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력메소드(.next()) 사용");
		//2. 변수 2개를 선언한다 num1, num2
		String num1, num2;
		//3. 입력할 값이 어떤건지 출력 메시지를 출력한다(정수1 입력 : )
		System.out.print("정수1 입력 : ");
		//4. 첫번째 변수에 입력메소드를 사용해서 값을 저장한다
		num1 = sc.next();
		//5. 메시지 출력(정수2 입력 : )
		System.out.print("정수2 입력 : ");
		//6. 두번째 변수에 입력메소드를 사용해서 값을 저장한다
		num2 = sc.next();
		//7. 두 변수를 연산해서 출력한다
//		System.out.println(num1);
//		System.out.println(num2);
		System.out.println(num1 + num2);
		System.out.println("두 정수의 합은 " + (Integer.parseInt(num1)+ Integer.parseInt(num2)));
		System.out.println("============================");
		
		//정수형 입력 메소드 : nextInt()
		System.out.println("정수형 입력메소드(.nextInt()) 사용");
		int number1, number2, result;
		System.out.println("정수1 입력 : ");
		number1 = sc.nextInt();
		System.out.println("정수2 입력 : ");
		number2 = sc.nextInt();
		result = number1 + number2;
		System.out.println("두 정수의 합은 " + result + "입니다");
		
		//nextLine() 한번만 사용하면 임시저장공간에 남아있는 모든 엔터를 소모한다
		String enter1 = sc.nextLine(); //엔터 소모
		System.out.println(enter1);
		String enter2 = sc.nextLine(); //입력 대기
		System.out.println(enter2);
		System.out.println("출력끝");
		
	}
}





