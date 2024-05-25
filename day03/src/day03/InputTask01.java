package day03;

import java.util.Scanner;

public class InputTask01 {
	public static void main(String[] args) {
//		//1) 이름과 오늘 날짜를 문자열로 입력받고
//		// 안녕하세요 000입니다
//		// 오늘 날짜는 00년 00월 00일 입니다 출력하기
//	
//		//변수명 name, date
//	
		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("이름 입력 :");
//		String name = sc.nextLine();
//		System.out.print("날짜 입력 : ");
//		String date = sc.nextLine();
//		System.out.println("안녕하세요 " + name + "입니다");
//		System.out.println("오늘 날짜는 " + date + "입니다");
		
		String num1 = sc.nextLine();
		String num2 = sc.nextLine();
		//덧셈 출력
		System.out.println((Integer.parseInt(num1)) + (Integer.parseInt(num2)));
		
	}
}












