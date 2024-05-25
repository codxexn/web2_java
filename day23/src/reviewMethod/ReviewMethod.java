package reviewMethod;

public class ReviewMethod {
	
	void printData(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}
	
	// 메소드 오버로딩
	void printData(User user) {
		System.out.println(user.name + "님, 환영합니다.");
	}
	
	// 배열값을 변경하는 메소드
	int[] changeData(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			ar[i] += 5;
		}
		return ar;
	}
	
	// 객체의 필드값을 변경하는 메소드
	User changeData(User user) {
		user.name = "짱구";
		user.id = "zzang1";
		user.pw = "gu1234";
		return user;
	}
	
	public static void main(String[] args) {
		
		ReviewMethod rm = new ReviewMethod();
		System.out.println(rm);
		
		// 배열을 매개변수로 받기
		int[] ar = {0, 1, 2};
		
		rm.printData(ar);
		rm.changeData(ar);
		rm.printData(ar);
		
		
		
		User u1 = new User();
		u1.name = "오르페우스";
		rm.printData(u1);
		
		User u2 = new User("no1zeus", "1111", "제우스");
		rm.printData(u2);
		
		rm.changeData(u2);
		rm.printData(u2);
		
		
		
	}
	
	
	
}
