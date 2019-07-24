package Chapter12.Listing;

import java.util.Scanner;

public class QuotientWithException {
	public static int quotient(int n1, int n2) {
		if(n2 == 0) {
			throw new ArithmeticException("Divisor cannot be zero");
		}
		
		return n1/n2;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two integers: ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		
		try {
			int result = quotient(n1, n2);
			
			System.out.println(n1 + "/" + n2 + " = " + result);
			
		}catch (ArithmeticException ae) {
			System.out.println("Error: " + ae.getMessage());
		}
		
		System.out.println("Continue ..");
	}
}
