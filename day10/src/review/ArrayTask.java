package review;

import java.util.Scanner;

public class ArrayTask {
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i + 1) + "번째 정수를 입력하시오 >> ");
			arr[i] = sc.nextInt();
		}
		
		int min = arr[0], max = arr[0];
		
		System.out.print("\n입력한 정수 배열 arr : {");
		
		for(int i : arr) {
			
			if(i < min) {
				min = i;
			} else if (i > max) {
				max = i;
			}
			
			if(i == arr[arr.length - 1]) {
				System.out.print(i);
			} else {
				System.out.print(i + ", ");
			}
		}
		
		System.out.print("}");
		
		
		System.out.println("\n배열 중 최소값 : " + min);
		System.out.println("배열 중 최대값 : " + max);
		
	}
}
