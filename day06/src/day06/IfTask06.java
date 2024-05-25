package day06;

import java.util.Scanner;

public class IfTask06 {
	public static void main(String[] args) {
		
		
		// 1. 메시지 출력
		// 2. 사용자 입력
		// 3. 변수에 저장
		// 4. if문에 1~10 사이의 숫자인지 검사 -> 변수 * 변수 -> 결과 저장
		// 5. else "잘못 입력했습니다"
		
		
		 Scanner sc = new Scanner(System.in);
		 
//		 String msg = "숫자를 입력하세요. >> ", result = null;
//		 int input = 0;
//		 
//		 System.out.println(msg);
//		 input = sc.nextInt();
//		 
//		 if	(input >= 1 && input <= 10) {
//			 result = "입력하신 숫자 " + input + " 의 제곱수는 " + input * input + " 입니다.";
//		 } else {
//			 result = "잘못 입력하셨습니다.";
//		 }
//		 
//		 System.out.println(result);
	
	
		 String msg = "월 을 입력하세요. >> ", result = null;
		 int input = 0;
		 
		 System.out.println(msg);
		 input = sc.nextInt();
		 
		 if (input == 1 || input == 2 || input == 12) {
			 result = "입력하신 달은 겨울입니다.";
		 } else if (input >= 3 && input <= 5) {
			 result = "입력하신 달은 봄입니다.";
		 } else if (input >= 6 && input <= 8) {
			 result = "입력하신 달은 여름입니다.";
		 } else if (input >= 9 && input <= 11) {
			 result = "입력하신 달은 가을입니다.";
		 } else {
			 result = "잘못 입력하셨습니다.";
		 }
		 
		 System.out.println(result);
		 
	
	
	
	}
}
