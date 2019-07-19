package Chapter11.Exercise.Ex4;

import java.util.ArrayList;
import java.util.Scanner;

public class MaximumElement {
	public static void main(String[] args) {
		System.out.print("Print list end with 0 value: ");
		Scanner reader = new Scanner(System.in);
		int val;
		ArrayList<Integer> list = new ArrayList<Integer>();
		// Loop get element from console
		while((val = reader.nextInt()) != 0) {
			list.add(val);
		}
		// Get max;
		Integer max = MaximumElement.max(list);
		System.out.println("Max: " + max);
	}
	
	public static Integer max(ArrayList<Integer> list) {
		if(list == null || list.size() == 0) {
			return null;
		}
		// Set max element
		Integer max = Integer.MIN_VALUE;
		for(Integer element : list) {
			if(max < element) {
				max = element;
			}
		}
		
		return max;
	}
}
