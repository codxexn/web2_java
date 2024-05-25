package day05;

import java.util.Scanner;

public class IfTask2 {
	public static void main(String[] args) {
		
		// 정수 2개 입력받고 큰값 출력
		
		 Scanner sc = new Scanner(System.in);
		 
		 int input1 = 0, input2 = 0;
		 
		 String msg1 = "정수 1 입력 : ", msg2 = "정수 2 입력 : ", result = null;
		
		 System.out.println(msg1);
		 input1 = sc.nextInt();
		 System.out.println(msg2);
		 input2 = sc.nextInt();
		 
		 if(input1 > input2) {
			 result = "더 큰 수는 " + input1 + " 입니다.";
		 } else if(input2 > input1) {
			 result = "더 큰 수는 " + input2 + " 입니다.";
		 } else {
			 result = "두 수는 같습니다.";
		 }
		 
		 System.out.println(result);
	}
}
