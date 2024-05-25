package classTest;

public class Student {

	private int javaScore, cScore, pythonScore;
	private double avg;
	private char grade;
	private String name;
	
	public Student() {;}
	
	
	public Student(int javaScore, int cScore, int pythonScore, char grade, String name) {
		super();
		this.javaScore = javaScore;
		this.cScore = cScore;
		this.pythonScore = pythonScore;
		this.grade = grade;
		this.name = name;
	}


	public int getJavaScore() {
		return javaScore;
	}


	public void setJavaScore(int javaScore) {
		this.javaScore = javaScore;
	}


	public int getcScore() {
		return cScore;
	}


	public void setcScore(int cScore) {
		this.cScore = cScore;
	}


	public int getPythonScore() {
		return pythonScore;
	}


	public void setPythonScore(int pythonScore) {
		this.pythonScore = pythonScore;
	}


	public double getAvg() {
		return avg;
	}


	public char getGrade() {
		return grade;
	}


	public void setGrade(char grade) {
		this.grade = grade;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String toString() {
		return "Student [javaScore=" + javaScore + ", cScore=" + cScore + ", pythonScore=" + pythonScore + ", avg="
				+ avg + ", grade=" + grade + ", name=" + name + "]";
	}
	




	public static void main(String[] args) {

		Student student1 = new Student(100, 95, 100, 'A', "이도은");
		
		student1.setcScore(100);
		
		System.out.println(student1);
		
		
		
	}

}
