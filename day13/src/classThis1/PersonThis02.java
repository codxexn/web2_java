package classThis1;

public class PersonThis02 {
	//this()를 사용
	
	//필드
	String name;
	int age;
	String gender;
	String occupation;
	
	//메소드
	void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.println("직업 : " + occupation);
	}
	
	//생성자
	public PersonThis02(String name, int age) {
		this(name, age, "여자", "개발자");
	}

	public PersonThis02(String name, int age, String gender, String occupation) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.occupation = occupation;
	}
	
	public static void main(String[] args) {
		PersonThis02 pr1 = new PersonThis02("유재석", 51, "남성", "연예인");
		PersonThis02 pr2 = new PersonThis02("김영선", 20);
		
		pr1.printInfo();
		pr2.printInfo();
		
	}
	
}
