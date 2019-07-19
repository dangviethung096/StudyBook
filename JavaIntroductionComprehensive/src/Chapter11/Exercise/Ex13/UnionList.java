package Chapter11.Exercise.Ex13;

import java.util.ArrayList;
import java.util.Scanner;


public class UnionList {
	/**
	 * Main function
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Input numbers in list 1 : ");
		
		String line = reader.nextLine();
		String[] strNumbers = line.split(" ");
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		// Convert to integer
		for(int i = 0; i < strNumbers.length; i++) 
			list1.add(Integer.parseInt(strNumbers[i]));
		
		System.out.println("Input numbers in list 2 : ");
		
		line = reader.nextLine();
		strNumbers = line.split(" ");
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		// Convert to integer
		for(int i = 0; i < strNumbers.length; i++) 
			list2.add(Integer.parseInt(strNumbers[i]));
		// Sort list
		ArrayList<Integer> numbers = UnionList.union(list1, list2);
		// Display
		System.out.println(numbers.toString());
	}
	
	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		// Selection sort
		ArrayList<Integer> unionList = new ArrayList<Integer>(list1);
		unionList.addAll(list2);
		return unionList;
	}
}
