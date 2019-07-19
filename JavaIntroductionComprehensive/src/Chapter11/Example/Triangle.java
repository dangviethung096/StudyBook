package Chapter11.Example;

public class Triangle extends Geometric {
	private double side1 = 1.0, side2 = 1.0, side3 = 1.0;
	/**
	 * No-arg constructors
	 */
	public Triangle() {
		
	}
	/**
	 * Three arg constructors with sides
	 * @param side1
	 * @param side2
	 * @param side
	 */
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	/**
	 * Constructor with full args
	 * @param side1
	 * @param side2
	 * @param side3
	 * @param color
	 * @param filled
	 */
	public Triangle(double side1, double side2, double side3, String color, boolean filled) {
		this(side1, side2, side3);
		this.setColor(color);
		this.setFilled(filled);
	}
	
	/**
	 * Get area using heron formula
	 * @return
	 */
	public double getArea() {
		double p = this.getPerimeter()/2;
		return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
	}
	
	/**
	 * Get Perimeter
	 * @return
	 */
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	
	/**
	 * Description about triangle
	 */
	@Override
	public String toString() {
		return super.toString() + "\nTriangle with side1 = " + side1 + ", side2 = " + side2 + ", side3 = " + side3 + 
								  "\nArea = " + this.getArea() + ", Perimeter = " + this.getPerimeter();
	}
	
	// All accessor method
	public double getSide1() {
		return side1;
	}
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	public double getSide2() {
		return side2;
	}
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	public double getSide3() {
		return side3;
	}
	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
	
}
