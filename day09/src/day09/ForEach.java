package day09;

import java.util.Scanner;

public class ForEach {
	public static void main(String[] args) {
		
//		int[] number = {1, 2, 3, 4, 5};
//		
//		for (int num : number) {
//			System.out.print(num + " ");
//		}
		
		String msg = "수학점수를 입력해주세요 >> ";
		Scanner sc = new Scanner(System.in);
		int[] math = new int[3];
		int avg = 0, sum = 0, result = 0;
		
		
		for (int i = 0; i < math.length; i++) {
			System.out.println(msg);
			math[i] = sc.nextInt();
		}
		
		for(int i : math) {
			sum += i;
		}
		
		result = sum / 3;
		System.out.println("세 점수의 평균값은 " + result + "점 입니다.");
		
		
		
	}
}
