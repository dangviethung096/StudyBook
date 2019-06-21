package Chapter11;

public class Test2 {
	public static void main(String[] args) {
		new Person2().printPerson();
		new Student2().printPerson();
	}
}

class Student2 extends Person2 {
	@Override
	public String getInfo() {
		return "Student";
	}
}

class Person2 {
	public String getInfo() {
		return "Person";
	}
	
	public void printPerson() {
		System.out.println(getInfo());
	}
}