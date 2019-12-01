// Write a Java program to check whether a triangle is equilateral,
// scalene or isosceles. Ask the user to provide the length of each side.
import java.util.Scanner;
public class EX5_3_3 {
	public static void main(String[] Strings) {
		Scanner input = new Scanner(System.in);

			System.out.print("Input first side length: ");
			double first = input.nextDouble();
			System.out.print("Input second side length: ");
			double second = input.nextDouble();
			System.out.print("Input third side length: ");
			double third = input.nextDouble();

			if (first == second && second == third)
				System.out.print("Triangle is Equilateral !");
			if (second == third || first == second || third == first)
				System.out.print("Triangle is Isosceles !");
			else
				System.out.print("Triangle is Scalene !");
	}
}