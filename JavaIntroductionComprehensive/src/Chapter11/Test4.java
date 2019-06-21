package Chapter11;

public class Test4 {
	public static void main(String[] args) {
		A1 a = new A1(2);
	}
}


class A1 extends B1 {
	public A1(int t) {
		System.out.println("A 's constructor is invoked");
	}
}

class B1 {
	public B1() {
		System.out.println("B 's constructor is invoked");
	}
}