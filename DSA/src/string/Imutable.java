package string;

//we have created a final class named Employee. 
//It have one final datamember, a parameterized constructor and getter method.
final class Employee {
	final String PanCard;

	public Employee(String PanCard) {
		this.PanCard = PanCard;
	}

	public String getPan() {
		return PanCard;
	}
}

public class Imutable {

	public static void main(String[] args) {
		Employee e = new Employee("AOPUPH677S");
		String s = e.getPan();
		System.out.println(s);
	}

}
