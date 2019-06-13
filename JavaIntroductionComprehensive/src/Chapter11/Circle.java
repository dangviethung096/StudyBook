package Chapter11;

public class Circle extends Geometric {
	private double radius;
	
	public Circle() {
		super();
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
}
