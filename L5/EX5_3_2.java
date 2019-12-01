// Write a Java program to solve quadratic equations.

import java.util.Scanner;
public class EX5_3_2 {
	public static void main(String[] Strings) {
		Scanner input = new Scanner(System.in);

			System.out.print("Input First Number: ");
			double first = input.nextDouble();
			System.out.print("Input Second Number: ");
			double second = input.nextDouble();
			System.out.print("Input Third Number: ");
			double third = input.nextDouble();

			double calcc = second * second - 4.0 * first * third;
			if (calcc > 0.0) {
				double rootFirst = (-second + Math.pow(calcc, 0.5)) / (2.0 * first);
				double rootSecond = (-second - Math.pow(calcc, 0.5)) / (2.0 * first);
				System.out.print("The roots are " + rootFirst + " and " + rootSecond);
			} else if (calcc == 0.0) {
				double rootFirst = -second / (2.0 * first);
				System.out.print("The root is " + rootFirst);
			} else {
				System.out.print("The equation has no real roots.");
			}
    }
}