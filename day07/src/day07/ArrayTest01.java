package day07;

import java.util.Random;

public class ArrayTest01 {

	public static void main(String[] args) {

		Random ran = new Random();
		
		
//		int random = (int)(Math.random() * 100);
		int random = ran.nextInt(10) + 1;
		System.out.println(random);
		
		
		
//		int[] arData = new int[10];
//		
//		for (int i = 0; i < arData.length; i++) {
////			arData[i] = (int)(Math.random() * 10);
//			arData[i] = ran.nextInt(100) + 1;
//			
//			for (int j = 0; j < i; j++) {
//				if (arData[i] == arData[j]) {
//					i--;
//				}
//			}
//		}
//		
//		
//		for (int i = 0; i < arData.length; i++) {
//			if ((i + 1) == arData.length) {
//				System.out.println(arData[i]);
//			} else {
//				System.out.print(arData[i] + ", ");
//			}
//		}
		
		
	}

}
