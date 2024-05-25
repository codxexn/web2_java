package day10;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Check {
	
	private String name;
	private int age;
	private String className;
	private static boolean ISCHECK = false;
	
	// 기본 생성자
	public Check() {;}
	
	// 초기화 생성자
	public Check(String name, int age, String className) {
		super();
		this.name = name;
		this.age = age;
		this.className = className;
	}


	@Override
	public String toString() {
		return "Check [name=" + name + ", age=" + age + ", className=" + className + "]";
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((className == null) ? 0 : className.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Check other = (Check) obj;
		if (age != other.age)
			return false;
		if (className == null) {
			if (other.className != null)
				return false;
		} else if (!className.equals(other.className))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	// getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	
	public static boolean isISCHECK() {
		return ISCHECK;
	}

	public static void setISCHECK(boolean iSCHECK) {
		ISCHECK = iSCHECK;
	}
	
	// 학생 이름, 나이, 클래스 변수 선언
	// 입력 체크인, 이름
	// 현재 시간으로 in 기준 19시 이후면 지각 출력
	// 19시 이전이면 출석체크되었습니다. 
	// 입력 체크아웃, 이름
	// 현재 시간 out 기준 22시 이전이면 무단이탈 출력
	// 22시 이후면 안녕히 가십시오.

	// check-in
	public void checkIn(String name) {
		LocalTime now = LocalTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH시 mm분");
		String formatedNow = now.format(formatter);
		
		int hour = now.getHour();
		int minute = now.getMinute();
		
		if (this.getName().equals(name)) {
			if (hour != 19) {
				System.out.println(name + "님, " + formatedNow  + " 출석체크 되셨습니다.");
				System.out.println((hour - 19) + "시간 " + (minute) + "분 지각");
			} else {
				System.out.println(name + "님, " + formatedNow  + " 출석체크 되셨습니다.");
			}
			ISCHECK = true;
		} else {
			System.out.println("입력하신 학생 정보가 일치하지 않습니다.");
			ISCHECK = false;
		}
	}

	// check-out
	public void checkOut(String name) {
		LocalTime now = LocalTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH시 mm분");
		String formatedNow = now.format(formatter);
		
		int hour = now.getHour();
		int minute = now.getMinute();
		
		if (ISCHECK) {
			// 출첵한 상황일 때
			if (this.getName().equals(name)) {
				if (hour < 22) {
					System.out.println("아직 수업이 끝나지 않아서 체크아웃할 수 없습니다.");
				} else {
					System.out.println(name + "님, " + formatedNow  + " 체크아웃 완료되셨습니다.");
				}
				ISCHECK = false;
			} else {
				System.out.println("입력하신 학생 정보가 일치하지 않습니다.");
			}
			
		} else {
			// 출첵 안된 상황일 때
			if (this.getName().equals(name)) {
				System.out.println(name + "님, 출석 체크를 먼저 진행해주세요.");
			} else {
				System.out.println("입력하신 학생 정보가 일치하지 않습니다.");
			}

		}
		
	}
	
	
	
	public static void main(String[] args) {

		Check student1 = new Check("제우스", 20, "JPA");
//		student1.checkIn("제우스");
		student1.checkOut("제우스");
		
		Check student2 = new Check("하데스", 24, "Web");
		student2.checkIn("하데스");
		

	}

}
