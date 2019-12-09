// Write a Java program to calculate the average value of array elements (do it with one & two dimensional array).
import java.util.Arrays;
public class EX6_3_2 {
	public static void main(String[] Strings) {
		int intArray[][] = {{1,2,3},{4,5,6}};
		int sum = 0;
		double elements = 0;
		for (int oneD = 0; oneD < intArray.length; oneD++) {
			elements += intArray[oneD].length;
			for (int twoD = 0; twoD < intArray[oneD].length; twoD++) {
				sum += intArray[oneD][twoD];
			}
		}
		System.out.print("Two dimensional Arrays: " + Arrays.toString(intArray[0]) + Arrays.toString(intArray[1]));
		System.out.print("\nAvg = " + sum / elements);
	}
}