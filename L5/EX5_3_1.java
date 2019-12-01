// Write a Java program to get a number from the user and print whether it is positive or negative.

import java.util.Scanner;
public class EX5_3_1 {
	public static void main(String[] Strings) {
		Scanner input = new Scanner(System.in);
			
			System.out.print("Input Number: ");
			double a = input.nextDouble();
			if (a > 0)
				System.out.print("\nNumber is: Positive\n");
			else
				System.out.print("\nNumber is: Negative\n");
	}
}