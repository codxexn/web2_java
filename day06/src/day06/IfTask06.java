package day06;

import java.util.Scanner;

public class IfTask06 {
	public static void main(String[] args) {
		
		
		// 1. �޽��� ���
		// 2. ����� �Է�
		// 3. ������ ����
		// 4. if���� 1~10 ������ �������� �˻� -> ���� * ���� -> ��� ����
		// 5. else "�߸� �Է��߽��ϴ�"
		
		
		 Scanner sc = new Scanner(System.in);
		 
//		 String msg = "���ڸ� �Է��ϼ���. >> ", result = null;
//		 int input = 0;
//		 
//		 System.out.println(msg);
//		 input = sc.nextInt();
//		 
//		 if	(input >= 1 && input <= 10) {
//			 result = "�Է��Ͻ� ���� " + input + " �� �������� " + input * input + " �Դϴ�.";
//		 } else {
//			 result = "�߸� �Է��ϼ̽��ϴ�.";
//		 }
//		 
//		 System.out.println(result);
	
	
		 String msg = "�� �� �Է��ϼ���. >> ", result = null;
		 int input = 0;
		 
		 System.out.println(msg);
		 input = sc.nextInt();
		 
		 if (input == 1 || input == 2 || input == 12) {
			 result = "�Է��Ͻ� ���� �ܿ��Դϴ�.";
		 } else if (input >= 3 && input <= 5) {
			 result = "�Է��Ͻ� ���� ���Դϴ�.";
		 } else if (input >= 6 && input <= 8) {
			 result = "�Է��Ͻ� ���� �����Դϴ�.";
		 } else if (input >= 9 && input <= 11) {
			 result = "�Է��Ͻ� ���� �����Դϴ�.";
		 } else {
			 result = "�߸� �Է��ϼ̽��ϴ�.";
		 }
		 
		 System.out.println(result);
		 
	
	
	
	}
}
