package day07;

import java.util.Scanner;

public class WhileTask {

	public static void main(String[] args) {
		  //2. ����ڷκ��� 1���� 5������ ���� 1���� �Է¹޾Ƽ�
	      // �ش� ���ڿ� �´� ����ܾ ����ϰ� ����
	      //��¿���
	      //�ùٸ� �� �Է½� ���
	      //1���� 5���� �����Է� : 1
	      //1�� ����� one�Դϴ�
	      //�߸��� �� �Է½� ���
	      //1���� 5���� �����Է� : 100
	      //�߸��� �Է��Դϴ���� �� �ٽ� �Է¹޵��� 
	      
			String result = null;
			String out = null;
			int input = 0;
			Scanner sc = new Scanner(System.in);
		
			while(input != 100) {
				
				System.out.print("���ڸ� �Է��Ͻÿ�. \n(������ ������ 100 �� �Է��Ͻÿ�.) >> ");
				input = sc.nextInt();
				
				switch (input) {
				case 1 :
					result = "one";
					break;
				case 2 :
					result = "two";
					break;
				case 3 :
					result = "three";
					break;
				case 4 :
					result = "four";
					break;
				case 5 :
					result = "five";
					break;
				case 100 :
					out = "out";
					break;	
				default :
					result = "again";
					break;
				}
				
					 if (out == "out") {
						break;
					} else if(result == "again") {
						System.out.print("1 ~ 5������ ");;
					} else {
						System.out.println("�Է��Ͻ� ���ڴ� ����� " + result + " �Դϴ�.");
					}
					
			}
	      System.out.println("��� ��");
	}

}
