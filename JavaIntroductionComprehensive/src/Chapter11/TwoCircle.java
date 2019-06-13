package Chapter11;

public class TwoCircle extends Circle {
	private double length;
	
	public TwoCircle(double radius, double length) {
		super(radius);
		this.length = length;
	}
	
	
	public double getArea() {
		return length * super.getArea();
	}
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
}	
