package day07;

import java.util.Scanner;

public class WhileTask {

	public static void main(String[] args) {
		  //2. 사용자로부터 1부터 5사이의 숫자 1개를 입력받아서
	      // 해당 숫자에 맞는 영어단어를 출력하고 종료
	      //출력예시
	      //올바른 값 입력시 출력
	      //1부터 5까지 숫자입력 : 1
	      //1은 영어로 one입니다
	      //잘못된 값 입력시 출력
	      //1부터 5까지 숫자입력 : 100
	      //잘못된 입력입니다출력 후 다시 입력받도록 
	      
			String result = null;
			String out = null;
			int input = 0;
			Scanner sc = new Scanner(System.in);
		
			while(input != 100) {
				
				System.out.print("숫자를 입력하시오. \n(나가고 싶으면 100 을 입력하시오.) >> ");
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
						System.out.print("1 ~ 5까지의 ");;
					} else {
						System.out.println("입력하신 숫자는 영어로 " + result + " 입니다.");
					}
					
			}
	      System.out.println("출력 끝");
	}

}
