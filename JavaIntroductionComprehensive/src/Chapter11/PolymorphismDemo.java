package Chapter11;

public class PolymorphismDemo {
	public static void main(String[] args) {
		disPlayObject(new Geometric("pink", true));
		
		disPlayObject(new Circle(3.2, "black"));
	}
	
	public static void disPlayObject(Geometric object) {
		System.out.println("Created on " + object.getDateCreated() + ". Color = " + object .getColor());
	}
}
