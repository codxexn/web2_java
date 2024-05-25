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
		// ���� �޼ҵ带 ����� ��ü�� �Ű������� ���� ��ü�� ������ true ���� (�Ϲ� Object equals �޼ҵ�� ����)
		
		if(obj instanceof Lecture) {
			 Lecture anotherLecture = (Lecture)obj;
			 if	(this.name == anotherLecture.name && this.teacherName == anotherLecture.teacherName) {
				 return true;
			 }
		}
		// ���� ��ü�� �ƴ� ��
		// ���� �Ű������� ���� ��ü�� ���� Ŭ���� Ÿ���ΰ�?
		// �׷��� Lecture Ÿ������ ��ü�� �ϳ� �� �������ְ� �Ű������� ���� ��ü�� Lecture Ÿ������ ��������ȯ �� ����
		// ���� �޼ҵ� ��� ��ü�� �񱳱� ��ü�� name�� teacherName �ʵ��� ���� ����? �׷��� true ����
		
		// �ΰ����� ����� ���� ��� �ƴ� ���, false ����
		return false;
	}


	public static void main(String[] args) {
		
		Lecture l1 = new Lecture("web", 400000, "������콺");
		Lecture l2 = new Lecture("web", 400000, "������콺");
		
		System.out.println(l1);
		System.out.println(l2);
		
		if(l1.equals(l2)) {
			System.out.println("�� ���Ǵ� ���� �����Դϴ�.");
		} else {
			System.out.println("�� ���Ǵ� �ٸ� ���� �Դϴ�.");
		}
		
	}

	
	//"web2", 500000, "���ν�"

}
