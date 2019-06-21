package Chapter11;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Student3().printPerson();
		new Person3().printPerson();
	}

}

class Student3 extends Person3 {
	private String getInfo() {
		return "Student";
	}
}

class Person3 {
	private String getInfo() {
		return "Person";
	}
	
	public void printPerson() {
		System.out.println(getInfo());
	}
}