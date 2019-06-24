package Chapter11;

public class Circle extends Geometric {
	private double radius;
	
	public Circle() {
		super();
	}
	
	public Circle(double radius, String color) {
		this(radius);
		setColor(color);
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
//		return getArea() * radius;
		return radius * radius * Math.PI;
	}
	
	public void printCircle() {
		System.out.println(toString());
		System.out.println(super.toString());
	}
	
	@Override
	public String toString() {
		String retVal = super.toString() + "\nString in circle with radius " + this.radius;
		return retVal;
	}
	
	@Override
	public boolean equals(Object circle) {
		return this.radius == ((Circle)circle).radius;
//		return this.radius == circle.radius;
	}
}
