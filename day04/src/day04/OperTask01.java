package day04;

import java.util.Scanner;

public class OperTask01 {
	public static void main(String[] args) {
		// 두자리수 정수를 입력받고 십의 자리와 일의 자리를 출력하기
		
		//[입출력 결과 예시]
		//숫자입력 : 51
		//십의 자리는 5입니다
		//일의 자리는 1입니다
		
		//로직설정!!
		//1. 변수선언(int 3개)
		//2. 입력클래스
		//3. 입력메소드(nextInt())
		//4. 산술연산자를 이용해서 계산한 결과를 출력( / 10, % 10)
		//5. 결과 출력
		
		int inputNum = 0, resultNum1 = 0, resultNum2 =0;
		Scanner sc = new Scanner(System.in);
		System.out.print("두자리수 정수를 입력하세요 : ");
		inputNum = sc.nextInt();
		
		resultNum1 = inputNum / 10;
		resultNum2 = inputNum % 10;
		
		System.out.println("십의 자리는 " + resultNum1 + "입니다.");
		System.out.println("일의 자리는 " + resultNum2 + "입니다.");
	}
}









