package objectTest;

public class Student {

	int math;
	int eng;
	int kor;
	String grade;
	double avg;
	
	public Student(int math, int eng, int kor, String grade) {
		super();
		this.math = math;
		this.eng = eng;
		this.kor = kor;
		this.grade = grade;
		this.avg = (math + eng + kor) / 3;
	}

	@Override
	public String toString() {
		return "Student [math=" + math + ", eng=" + eng + ", kor=" + kor + ", grade=" + grade + ", avg=" + avg + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(avg);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + eng;
		result = prime * result + ((grade == null) ? 0 : grade.hashCode());
		result = prime * result + kor;
		result = prime * result + math;
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
		Student other = (Student) obj;
		if (Double.doubleToLongBits(avg) != Double.doubleToLongBits(other.avg))
			return false;
		if (eng != other.eng)
			return false;
		if (grade == null) {
			if (other.grade != null)
				return false;
		} else if (!grade.equals(other.grade))
			return false;
		if (kor != other.kor)
			return false;
		if (math != other.math)
			return false;
		return true;
	}
	
	
	
	
	
	
}
