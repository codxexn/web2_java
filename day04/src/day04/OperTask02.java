package day04;

import java.util.Scanner;

public class OperTask02 {
	public static void main(String[] args) {
		//정수 2개를 입력받아서 작은 수 출력하기
		
		//1. 입력클래스 import
		//2. 변수 선언(변수 3개 int형, num1, num2, result)
		//3. 숫자 1입력 : 메시지 출력
		//4. 입력 메소드
		//5. 숫자 2입력 : 메시지 출력
		//6. 입력 메소드
		//7. result 변수에 입력받은 값을 비교하여 값을 대입(삼항연산자)
		//8. 결과 출력(작은 수는 ---입니다.)
		
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		String result = null;
		System.out.println("숫자1 입력 : ");
		num1 = sc.nextInt();
		System.out.println("숫자2 입력 : ");
		num2 = sc.nextInt();
		System.out.println(num1);
		System.out.println(num2);
//		System.out.println(num1 > num2); //true or false
//		result = num1 > num2 ? num2 : num1;
		result = num1 > num2 ? "작은수 : " + num2 : num1 == num2 ? "같다": "작은수 : " + num1;
//		System.out.println("작은 수는 " + result + "입니다");
		System.out.println(result);
	}
}












