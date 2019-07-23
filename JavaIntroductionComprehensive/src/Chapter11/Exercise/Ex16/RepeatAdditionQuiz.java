package Chapter11.Exercise.Ex16;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RepeatAdditionQuiz {
	public static void main(String[] args) {
		Random random = new Random();
		int a = random.nextInt(10), b = random.nextInt(10);
		// Get input
		Scanner reader = new Scanner(System.in);
		
		while(a != 0 || b != 0) {
			System.out.print("What is " + a + " + " + b + "? ");
			ArrayList<Integer> answers = new ArrayList<Integer>();
			int answer = reader.nextInt();
			while(a + b != answer) {
				if (answers.contains(answer)) {
					System.out.println("You already entered " + answer);
				}
				System.out.print("Wrong answer. Try again. " + "What is " + a + " + " + b + "? ");
				answers.add(answer);
				answer = reader.nextInt();
			}
			System.out.println("You got it");
			a = random.nextInt(10); b = random.nextInt(10);
		}
		
	}
}
