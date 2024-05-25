package exceptionTest;

public class ExceptionTest02 {
	public void printLength(String data) {
		int result = data.length();
		System.out.println("data의 문자 수 : " + result);
	}
	
	public static void main(String[] args) {
		
		ExceptionTest02 et = new ExceptionTest02();
		
		try {
			et.printLength("없을 수가 없는 거 아냐?");
		} catch (NullPointerException e) {
			System.out.println("입력된 값이 없습니다.");
			e.printStackTrace();
		} finally {
			System.out.println("프로그램을 종료합니다.");
		}
		
		
		
	}
	
}
