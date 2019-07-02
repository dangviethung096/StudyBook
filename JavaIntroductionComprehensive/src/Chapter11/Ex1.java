package Chapter11;

import java.io.IOException;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) throws IOException {
		double[] side = new double[3];
		int count = 0;
		String color;
		boolean filled;
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Input triangle: ");
		
		System.out.print("Three side: ");
		
		//Clear all next
		while(reader.hasNext()) {
			if(reader.hasNextDouble()) {
				side[count++] = reader.nextDouble();
				if(count == 3) {
					// Skip all
					reader.nextLine();
//					System.in.skip(System.in.available());
					break;
				}
			} else {
				reader.next();
			}
			
		}
			
		
		System.out.print("Color: ");
		color = reader.nextLine();
		
		System.out.print("filled: "); 
		filled = reader.nextBoolean();
		
		Triangle triangle = new Triangle(side[0], side[1], side[2], color, filled);
		System.out.println(triangle.toString());
	}
}
