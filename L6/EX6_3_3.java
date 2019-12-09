// Write a Java program to test if an array contains a specific value.
import java.util.Arrays;
import java.util.Scanner;
public class EX6_3_3 {
	public static void main(String[] Strings) {
		Scanner input = new Scanner(System.in);
		double doubleArray[][] = {{1,2,3,3.33},{4,4.2,5,6}};
		System.out.print("Data in Arrays: " + Arrays.toString(doubleArray[0]) + Arrays.toString(doubleArray[1]));
		System.out.print("\nInput number for verification: ");
		double nr = input.nextDouble();
		boolean result = false;
		for (int oneD = 0; oneD < doubleArray.length; oneD++) {
			for (int twoD = 0; twoD < doubleArray[oneD].length; twoD++) {
				if (doubleArray[oneD][twoD] == nr)
					result = true;
			}
		}
		System.out.print("Result: " + result);
	}
}