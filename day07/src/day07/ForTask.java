package day07;

public class ForTask {
	public static void main(String[] args) {
		
		int zzak = 0;
		int hol = 0;
		
		// ¦�� ��
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				zzak += i;
			} else {
				continue;
			}
		}
		
		System.out.println("¦�� �� : " + zzak);
		
		
		// Ȧ�� ��
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				hol += i;
			} else {
				continue;
			}
		}
		
		System.out.println("Ȧ�� �� : " + hol);
		
		
		
	}
}
