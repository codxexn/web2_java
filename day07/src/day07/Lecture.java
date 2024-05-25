package day07;

public class Lecture {

	String name;
	int price;
	String teacherName;
	
	public Lecture() {;}
	

	public Lecture(String name, int price, String teacherName) {
		super();
		this.name = name;
		this.price = price;
		this.teacherName = teacherName;
	}
	

	@Override
	public String toString() {
		return "Lecture [name=" + name + ", price=" + price + ", teacherName=" + teacherName + "]";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		// 만약 메소드를 사용한 객체와 매개변수로 받은 객체가 같으면 true 리턴 (일반 Object equals 메소드와 동일)
		
		if(obj instanceof Lecture) {
			 Lecture anotherLecture = (Lecture)obj;
			 if	(this.name == anotherLecture.name && this.teacherName == anotherLecture.teacherName) {
				 return true;
			 }
		}
		// 같은 객체가 아닐 때
		// 만약 매개변수로 받은 객체가 같은 클래스 타입인가?
		// 그러면 Lecture 타입으로 객체를 하나 더 생성해주고 매개변수로 받은 객체를 Lecture 타입으로 강제형변환 후 대입
		// 만약 메소드 사용 객체와 비교군 객체의 name과 teacherName 필드의 값이 같냐? 그러면 true 리턴
		
		// 두가지의 경우의 수가 모두 아닐 경우, false 리턴
		return false;
	}


	public static void main(String[] args) {
		
		Lecture l1 = new Lecture("web", 400000, "오르페우스");
		Lecture l2 = new Lecture("web", 400000, "오르페우스");
		
		System.out.println(l1);
		System.out.println(l2);
		
		if(l1.equals(l2)) {
			System.out.println("두 강의는 같은 강의입니다.");
		} else {
			System.out.println("두 강의는 다른 강의 입니다.");
		}
		
	}

	
	//"web2", 500000, "에로스"

}
