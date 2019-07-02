package Chapter11.P1;

public class C2 {
	C1 c1 = new C1();
	public C2() {
		System.out.println(c1.x);
		System.out.println(c1.y);
		System.out.println(c1.z);
//		System.out.println(c1.u);
		c1.m();
	}
}
