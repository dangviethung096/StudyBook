package Chapter11.Exercise.Ex9;

import java.util.ArrayList;
import java.util.Scanner;

public class Matrix {
	private ArrayList<ArrayList<Integer>> matrix;
	
	public void set(int rowIndex, int colIndex, int value) {
		matrix.get(rowIndex).set(colIndex, value);
	}
	
	/**
	 * Constructor
	 * @param n
	 */
	public Matrix(int n) {
		matrix = new ArrayList<ArrayList<Integer>>();
		
		for(int i = 0; i < n; i++) {
			matrix.add(new ArrayList<Integer>());
			for(int j = 0; j < n; j++) {
				matrix.get(i).add(0);
			}
		}
	}
	
	public ArrayList<Integer> largestRow() {	
		int max = -1;
		ArrayList<Integer> largestRow = new ArrayList<Integer>();
		
		for(int rowIndex = 0; rowIndex < matrix.size(); rowIndex++) {
			int sum = 0;
			for(int colIndex = 0; colIndex < matrix.size(); colIndex++) {
				sum += matrix.get(rowIndex).get(colIndex);
			}
			// Add to list
			if(sum > max) {
				largestRow.clear();
				largestRow.add(rowIndex);
				max = sum;
			}else if(sum == max) {
				largestRow.add(rowIndex);
			}
		}
		return largestRow;
	}
	
	public ArrayList<Integer> largestCol() {	
		int max = -1;
		ArrayList<Integer> largestCol = new ArrayList<Integer>();
		
		for(int colIndex = 0; colIndex < matrix.size(); colIndex++) {
			int sum = 0;
			for(int rowIndex = 0; rowIndex < matrix.size(); rowIndex++) {
				sum += matrix.get(rowIndex).get(colIndex);
			}
			// Add to list
			if(sum > max) {
				largestCol.clear();
				largestCol.add(colIndex);
				max = sum;
			}else if(sum == max) {
				largestCol.add(colIndex);
			}
		}
		return largestCol;
	}
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
//		Random random = new Random();
		System.out.print("Enter the array size n: ");
		String strNumber = reader.nextLine();
		int number = Integer.parseInt(strNumber);
//		Init matrix
		Matrix matrix = new Matrix(number);
		
//		Get matrix
		System.out.println("The random array is ");
		for(int rowIndex = 0; rowIndex < number; rowIndex++) {
			
			String line = reader.nextLine();
			for(int colIndex = 0; colIndex < number; colIndex++) {
				matrix.set(rowIndex, colIndex, new Integer(line.charAt(colIndex) - 48));
			}
		}
		
//		Get largest col and row
		System.out.print("Largest row: ");
		ArrayList<Integer> larRow = matrix.largestRow();
		
		for(int i = 0; i < larRow.size(); i++) {
			System.out.print(larRow.get(i) + " ");
		}
		
		System.out.print("\nLargest col: ");
		ArrayList<Integer> larCol = matrix.largestCol();
		for(int j = 0; j < larCol.size(); j++) {
			System.out.print(larCol.get(j) + " ");
		}

	}
}
