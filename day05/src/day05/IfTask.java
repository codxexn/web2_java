package day05;

import java.util.Scanner;

public class IfTask {
	public static void main(String[] args) {
		
		 String quizMsg = "다음 중 동물이 아닌것은?\n"
		            + "1. 강아지\n"
		            + "2. 고양이\n"
		            + "3. 사자\n"
		            + "4. 컴퓨터\n"
		            + "입력 : ";
		      
		      System.out.println(quizMsg);
		      
		      Scanner sc = new Scanner(System.in);
		
		      final int ANSWER = 4;
		      int choice = sc.nextInt();
		  
		      
		      if(choice == ANSWER) {
		    	  System.out.println("정답입니다.");
		      } else if (choice <= 3 && choice >= 1) {
		    	  System.out.println("오답입니다.");
		      } else {
		    	  System.out.println("잘못 입력하셨습니다.");
		      }
		      
		
	}
}
