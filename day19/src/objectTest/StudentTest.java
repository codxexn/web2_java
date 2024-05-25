package objectTest;

public class StudentTest {
	public static void main(String[] args) {
		
		Student st1 = new Student(87, 100, 99, "C");
		Student st2 = new Student(87, 100, 99, "C");
		
		System.out.println(st1.toString());
		
		System.out.println(st1 == st2);
		
	}
}
