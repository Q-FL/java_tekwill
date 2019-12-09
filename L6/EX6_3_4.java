// Write a Java program to find the index of an array element.
import java.util.Arrays;
import java.util.Scanner;
public class EX6_3_4 {
	public static void main(String[] Strings) {
		Scanner input = new Scanner(System.in);
		double doubleArray[][] = {{1,2,3,3.33},{4,4.2,5,6}};
		System.out.print("Data in Arrays: " + Arrays.toString(doubleArray[0]) + Arrays.toString(doubleArray[1]));
		System.out.print("\nInput number for verification: ");
		double nr = input.nextDouble();
		for (int oneD = 0; oneD < doubleArray.length; oneD++) {
			if (Arrays.binarySearch(doubleArray[oneD], nr) >= 0) {
				System.out.print("Found "+nr+" in: Array: "+oneD+" Index: "+Arrays.binarySearch(doubleArray[oneD],nr)); 
				break;
			}
		}
	}
}