package objectTest;

public class StudentTask {

	String name;
	int age;
	int number;
	
	public StudentTask(String name, int age, int number) {
		super();
		this.name = name;
		this.age = age;
		this.number = number;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (this.number == ((StudentTask)obj).number && this.age == ((StudentTask)obj).age) {
			return true;
		} else {
			return false;
		}
	}
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.number;
	}

	public static void main(String[] args) {
		
		
		StudentTask st1 = new StudentTask("제우스", 20, 1);
		StudentTask st2 = new StudentTask("제우스", 20, 2);
		
		System.out.println(st1.equals(st2));
		
		System.out.println(st1.hashCode());
		System.out.println(st2.hashCode());
		
		
	}
	
}
