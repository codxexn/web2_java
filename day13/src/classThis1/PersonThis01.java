package classThis1;

public class PersonThis01 {
	//필드
	String name;
	int age;
	String gender;
	String occupation;
	
	//메소드
	//객체 정보를 출력하는 메소드
	void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.println("직업 : " + occupation);
	}

	//생성자
	public PersonThis01(String name, int age) {
		this.name = name;
		this.age = age;
		this.gender = "남자";
		this.occupation = "개발자";
	}
	
	public PersonThis01(String name, int age, String occupation) {
		this.name = name;
		this.age = age;
		this.gender = "여자";
		this.occupation = occupation;
	}

	
	public PersonThis01(String name, int age, String gender, String occupation) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.occupation = occupation;
	}

	public static void main(String[] args) {
		PersonThis01 pr1 = new PersonThis01("유재석", 51, "연예인");
		pr1.printInfo();
	}
	
}
