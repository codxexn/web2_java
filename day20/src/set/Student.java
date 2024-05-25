package set;

import java.util.HashSet;

public class Student {
   //필드
   int number; //학생의 번호
   String name;  //학생의 이름
   
   //생성자
   public Student(int number, String name) {
      super();
      this.number = number;
      this.name = name;
   }


   @Override
   public String toString() {
      // TODO Auto-generated method stub
      return super.toString();

   }

   //메소드 오버라이딩
   //equals 객체가 자기 자신과 같은지 검사 항상 true 반환
   //Student 클래스의 인스턴스인지 확인하고 번호를 기준으로 두 객체를 비교하여 동등한지 여부를 반환
   @Override
	public boolean equals(Object obj) {
		
		if (this == obj) {
			return true;
		} else if (obj instanceof Student) {
			if (this.number == ((Student)obj).number) {
				return true;
			} else {
				return false;
			}
			
		} else {
			return false;
		}
   }

   //hashCode 학생번호를 반환
   @Override
	public int hashCode() {
		return this.number;
	}
   
   
   public static void main(String[] args) {
	
	   Student st1 = new Student(1, "제우스");
	   Student st2 = new Student(1, "제우스");
	   
	   HashSet<Student> st3 = new HashSet<>();
	   st3.add(new Student(1, "제우스"));
	   
	   System.out.println(st1.hashCode());
	   System.out.println(st2.hashCode());
	   System.out.println(st3.hashCode());
	   System.out.println(st1.equals(st2));
	   
}
   
   
   
   

   
}