package day06;

import java.util.Scanner;

public class SwitchTest01 {
	
	
	
	@Override
	public String toString() {
		return super.toString();
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		 String msg = "�� �� �Է��ϼ���. >> ", result = null;
		 int input = 0;
		 
		 System.out.println(msg);
		 input = sc.nextInt();
		 
		 switch(input) {
		 case 1 : case 2 : case 12 :
			 result = "�ܿ�";
			 break;
		 case 3 : case 4 : case 5 :
			 result = "��";
			 break;
		 case 6 : case 7 : case 8 :
			 result = "����";
			 break;
		 case 9 : case 10 : case 11 :
			 result = "����";
			 break;
		 default :
			 result = "�߸� �Է��ϼ̽��ϴ�";
			 break;
		 }
		 
		 System.out.println(result.toString());

		
		 
		 
	}
}
