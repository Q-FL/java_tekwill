// Create a program which reads from the keyboard three numbers and prints to the console the one that is
// smaller than others. Implement the solution using:
import java.util.Scanner;
public class EX5_2 {
	public static void main(String[] Strings) {
		Scanner input = new Scanner(System.in);

			System.out.print("Input First Number: ");
			double first = input.nextDouble();
			System.out.print("Input Second Number: ");
			double second = input.nextDouble();
			System.out.print("Input Third Number: ");
			double third = input.nextDouble();
			
			if (first > second)
				if (first > third)
					System.out.println(first);
			if (second > first)
				if (second > third)
					System.out.println(second);
			if (third > first)
				if (third > second)
					System.out.println(third);
	}
}