package Chapter11.Exercise.Ex12;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicate {
	/**
	 * Main function
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Input number: ");
		
		String line = reader.nextLine();
		String[] strNumbers = line.split(" ");
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		// Convert to integer
		for(int i = 0; i < strNumbers.length; i++) 
			numbers.add(Integer.parseInt(strNumbers[i]));
		// Sort list
		RemoveDuplicate.removeDuplicate(numbers);
		// Display
		System.out.println(numbers.toString());
	}
	
	public static void removeDuplicate(ArrayList<Integer> list) {
		// Selection sort
//		ArrayList<Integer> indexDeleted = new ArrayList<Integer>();
		int length = list.size();
		for(int i = 0; i < length; i++) {
			for(int j = i + 1; j < length; j++) {
				if(list.get(i).equals(list.get(j)) ) {
					list.remove(j);
					j--;
					length--;
				}
			}
		}
	}
	
}