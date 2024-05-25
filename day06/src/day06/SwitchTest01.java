package day06;

import java.util.Scanner;

public class SwitchTest01 {
	
	
	
	@Override
	public String toString() {
		return super.toString();
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		 String msg = "월 을 입력하세요. >> ", result = null;
		 int input = 0;
		 
		 System.out.println(msg);
		 input = sc.nextInt();
		 
		 switch(input) {
		 case 1 : case 2 : case 12 :
			 result = "겨울";
			 break;
		 case 3 : case 4 : case 5 :
			 result = "봄";
			 break;
		 case 6 : case 7 : case 8 :
			 result = "여름";
			 break;
		 case 9 : case 10 : case 11 :
			 result = "가을";
			 break;
		 default :
			 result = "잘못 입력하셨습니다";
			 break;
		 }
		 
		 System.out.println(result.toString());

		
		 
		 
	}
}
