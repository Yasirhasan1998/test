package string;

public class ToString {

	public static void main(String[] args) {
		Student s = new Student(112, "yasir");
		System.out.println(s);
		
	}

}

class Student {
	int roll;
	String name;

	public Student(int roll, String name) {
		this.name = name;
		this.roll = roll;

	}
	public String toString() {
		return roll+" "+name;
	}
}
