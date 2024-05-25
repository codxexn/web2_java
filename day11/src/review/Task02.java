package review;

public class Task02 {
	
	int[] locker = new int[5];
	
	public void setLockerPw(int lockerNumber, int password) {
		
		if (locker[lockerNumber - 1] == 0) {
			locker[lockerNumber - 1] = password;
			System.out.println(lockerNumber + "번 사물함에 비밀번호가 설정되었습니다.");
		} else {
			System.out.println("이미 사용중인 사물함입니다.");
		}
		
	}
	
	
	public void checkLockerPw(int lockerNumber, int password) {
		
		if (locker[lockerNumber - 1] == 0) {
			System.out.println("비밀번호를 먼저 설정해주시기 바랍니다.");
		} else if(locker[lockerNumber - 1] == password) {
			System.out.println("비밀번호 일치");
		} else {
			System.out.println("비밀번호 불일치");
		}
		
	}
	
	
	public static void main(String[] args) {
		
		
		Task02 t = new Task02();
		
		
		t.setLockerPw(2, 1234);
		t.checkLockerPw(2, 1234);
		
		t.setLockerPw(1, 0234);
		t.checkLockerPw(1, 0001);
		
		t.checkLockerPw(3, 0000);
		

		
	}
}
