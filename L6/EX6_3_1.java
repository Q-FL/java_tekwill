// Write a Java program to sum values of an array (do it with one & two dimensional array).
import java.util.Arrays;
public class EX6_3_1 {
	public static void main(String[] Strings) {
		int intArray[][] = {{1,2,3},{3,2,1}};
		int sum = 0;
		for (int oneD = 0; oneD < intArray.length; oneD++) {
			for (int twoD = 0; twoD < intArray[oneD].length; twoD++) {
				sum += intArray[oneD][twoD];
			}
		}
		System.out.print("Two dimensional Arrays: " + Arrays.toString(intArray[0]) + Arrays.toString(intArray[1]));
		System.out.print("\nSum = " + sum);
	}
}