package day05;

import java.util.Scanner;

public class IfTask {
	public static void main(String[] args) {
		
		 String quizMsg = "���� �� ������ �ƴѰ���?\n"
		            + "1. ������\n"
		            + "2. �����\n"
		            + "3. ����\n"
		            + "4. ��ǻ��\n"
		            + "�Է� : ";
		      
		      System.out.println(quizMsg);
		      
		      Scanner sc = new Scanner(System.in);
		
		      final int ANSWER = 4;
		      int choice = sc.nextInt();
		  
		      
		      if(choice == ANSWER) {
		    	  System.out.println("�����Դϴ�.");
		      } else if (choice <= 3 && choice >= 1) {
		    	  System.out.println("�����Դϴ�.");
		      } else {
		    	  System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		      }
		      
		
	}
}
