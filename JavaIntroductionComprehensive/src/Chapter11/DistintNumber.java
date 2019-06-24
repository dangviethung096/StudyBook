package Chapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class DistintNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		
		int value;
		do {
			value = input.nextInt();
			
			if(!numberList.contains(value) && value != 0) {
				numberList.add(value);
			}
			
		} while(value != 0);
		
		System.out.println(numberList);
	}

}
