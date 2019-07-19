package Chapter11.Exercise.Ex11;

import java.util.ArrayList;
import java.util.Scanner;

public class SortArrayList {
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
		SortArrayList.sort(numbers);
		// Display
		System.out.println(numbers.toString());
	}
	
	public static void sort(ArrayList<Integer> list) {
		// Selection sort
		int length = list.size();
		for(int i = 0; i < length; i++) {
			for(int j = i; j < length; j++) {
				if(list.get(i) > list.get(j)) {
					SortArrayList.swap(list, i, j);
				}
			}
		}
	}
	
	public static void swap(ArrayList<Integer> list, int index1, int index2) {
		Integer temp = list.get(index1);
		list.set(index1, list.get(index2));
		list.set(index2, temp);
	}
}
