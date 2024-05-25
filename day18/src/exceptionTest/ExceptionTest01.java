package exceptionTest;

import java.util.Scanner;

public class ExceptionTest01 {
	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		System.out.println("나누고 싶은 숫자를 입력하시오. >> ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int result;
		try {
			result = 10 / input;
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("나눌 수 없는 숫자입니다.");
			e.printStackTrace();
		} finally {
			System.out.println("프로그램 종료");
		}
		
	}
}
