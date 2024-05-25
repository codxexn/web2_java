package synchronizationTest;

import javax.swing.JOptionPane;

public class MainEx {
	public static void main(String[] args) {
		
		ThreadEx te = new ThreadEx();
		Thread t1 = new Thread(te);
		
		
		String[] btn = {"-1", "종료"};
		int choice = 0;
		t1.start();
		
		while(true) {
			choice = JOptionPane.showOptionDialog(null, "", "숫자놀이", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, btn, null);
		
					if (choice == 0) {
						te.user();
					} else {
						t1.interrupt();
						// 쓰레드가 멈췄을 때 interrupted exception을 발생시킨다.
					}
		
		}
		
		
		
	}
}
