package day05;

import java.util.Scanner;

public class IfTask2 {
	public static void main(String[] args) {
		
		// ���� 2�� �Է¹ް� ū�� ���
		
		 Scanner sc = new Scanner(System.in);
		 
		 int input1 = 0, input2 = 0;
		 
		 String msg1 = "���� 1 �Է� : ", msg2 = "���� 2 �Է� : ", result = null;
		
		 System.out.println(msg1);
		 input1 = sc.nextInt();
		 System.out.println(msg2);
		 input2 = sc.nextInt();
		 
		 if(input1 > input2) {
			 result = "�� ū ���� " + input1 + " �Դϴ�.";
		 } else if(input2 > input1) {
			 result = "�� ū ���� " + input2 + " �Դϴ�.";
		 } else {
			 result = "�� ���� �����ϴ�.";
		 }
		 
		 System.out.println(result);
	}
}
