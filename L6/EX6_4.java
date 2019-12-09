// Write a Java program to print grid from "-" symbol.
import java.util.Scanner;
public class EX6_4 {
	public static void main(String[] Strings) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input Grid Size: ");
		int sizeGrid = input.nextInt();
		System.out.print("Input Grid Length: ");
		int lengthGrid = input.nextInt();
		for (int countSize = 0; countSize < sizeGrid; countSize++) {
			System.out.print("\n-");
			for (int countLength = 0; countLength < (lengthGrid - 1); countLength++) {
				System.out.print(" -");
			}
		}
	}
}