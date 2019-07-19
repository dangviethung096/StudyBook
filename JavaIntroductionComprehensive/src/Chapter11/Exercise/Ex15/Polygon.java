package Chapter11.Exercise.Ex15;

import java.util.ArrayList;
import java.util.Scanner;

public class Polygon {
	ArrayList<Point> points = new ArrayList<Point>();
	
	public Polygon(ArrayList<Point> points) {
		this.points = points;
	}
	
	public double getArea() {
		int sum1 = 0, sum2 = 0;
		int length = points.size();
		for(int i = 0; i < length; i++) {
			if(i != length -1) {
				sum1 += (points.get(i).getX() * points.get(i + 1).getY());
				sum2 += (points.get(i).getY() * points.get(i + 1).getX());
			}else {
				sum1 += (points.get(i).getX() * points.get(0).getY());
				sum2 += (points.get(i).getY() * points.get(0).getX());
			}
		}
		// Get area
		double retVal = Math.abs(0.5 * (sum1 - sum2));
		return retVal;
	}
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter number of the points: ");
		int num = Integer.parseInt(reader.nextLine());
		
		System.out.println("Enter the coordinates of the points: ");
		String[] coordinates = reader.nextLine().split(" ");
		// Get num points
		ArrayList<Point> points = new ArrayList<Point>();
		for(int i = 0; i < num; i++) {
			points.add(new Point(Double.parseDouble(coordinates[2*i]), Double.parseDouble(coordinates[2*i + 1])));
		}
		// Create new polygon
		Polygon polygon = new Polygon(points);
		// Get area
		System.out.print("The total area: " + polygon.getArea());
		
	}
}
