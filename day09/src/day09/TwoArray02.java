package day09;

public class TwoArray02 {
	
	public int multiple(int a, int b) {
		return a * b;
	}
	
	// JVM 메모리 영역을 따로 관리하기 위해서
	// stack/ heap
	
	
	
	public static void main(String[] args) {
		
//		int[][] arr = new int[3][4];
//		int input = 1;
//		
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 4; j++) {
//				arr[i][j] = input;
//				input++;
//				System.out.println(arr[i][j]);
//			}
//		}
		
		
		
		TwoArray02 ta = new TwoArray02();
		
		int result = ta.multiple(5, 3);
		
		System.out.println(result);
		
		// 메소드의 정의와 사용
		
		/*
		 * 
		 * 
		 * */
		
	}
}
