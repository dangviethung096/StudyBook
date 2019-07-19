package Chapter11.Example;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new A2();
		new B2();
	}

}

class A2 {
	int i = 7;
	public A2() {
		setI(20);
		System.out.println("i from A is " + i);
	}
	
	public void setI(int i) {
		this.i = 2 * i;
	}
}

class B2 extends A2 {
	public B2() {
		System.out.println("i from B is " + i);
	}
	
	public void setI(int i) {
		this.i = i * 3;
	}
}