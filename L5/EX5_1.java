// Create a program which reads from the keyboard two numbers and prints to the console the one that is
// bigger. Implement the solution using:
import java.util.Scanner;
public class EX5_1 {
	public static void main(String[] Strings) {
		Scanner input = new Scanner(System.in);
			System.out.print("Input first number: ");
			double first = input.nextDouble();
			System.out.print("Input second number: ");
			double second = input.nextDouble();

			if (first > second)
				System.out.print("Biggest number is: " + first);
			else
				System.out.print("Biggest number is: " + second);
	}
}