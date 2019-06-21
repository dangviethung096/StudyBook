package Chapter11;

public class DynamicBindingDemo {
	public static void main(String[] args) {
		m(new Student());
		m(new GraduateStudent());
		m(new Human());
		m(new Object());
	}
	
	public static void m(Object x) {
		System.out.println(x.toString());
	}
}

class Human {
	@Override
	public String toString() {
		return "Human";
	}
}

class GraduateStudent extends Student {
	
}

class Student extends Human {
	@Override
	public String toString() {
		return "Student";
	}
}


