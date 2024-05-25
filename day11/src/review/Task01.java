package review;

import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] password = {1, 2, 3, 4, 5};
		String confirm = "비밀번호를 입력해주세요. >> ";
		String input = "";
		
		System.out.println(confirm);
		input = sc.nextLine();
		String arr[] = input.split("");
		boolean result = false;
	
		
		
		for (int i = 0; i < password.length; i++) {
			if (password[i] != Integer.parseInt(arr[i])) {
				result = false;
				break;
			} else {
				result = true;
			}
		}
		
		if (result) {
			System.out.println("비밀번호 일치");
		} else {
			System.out.println("비밀번호 불일치");
		}
		
	}
}
