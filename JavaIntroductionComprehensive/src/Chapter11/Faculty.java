package Chapter11;

public class Faculty extends Employee {
	public static void main(String[] args) {
		new Faculty();
	}
	
	public Faculty() {
		System.out.println("A new faculty");
	}
}

class Employee extends Person {
	public Employee() {
		this("Invoke person constructor?");
		System.out.println("Employee constructor");
	}
	
	public Employee(String s) {
		System.out.println(s);
	}
}

class Person {
	public Person() {
		System.out.println("Person constructor!");
	}
}
