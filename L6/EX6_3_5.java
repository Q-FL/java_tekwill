// Write a Java program to copy the elements of an array into another array.
import java.util.Arrays;
public class EX6_3_5 {
	public static void main(String[] Strings) {
		double doubleArray[][] = {{1,2,3,3.33},{4,4.2,5,6}};
		System.out.print("Data in Arrays: " + Arrays.toString(doubleArray[0]) + Arrays.toString(doubleArray[1]));
		double doubleArrayCopy[][] = new double[doubleArray[0].length][doubleArray[1].length];
		for (int oneD = 0; oneD < doubleArray.length; oneD++) {
			for (int twoD = 0; twoD < doubleArray[oneD].length; twoD++) {
				doubleArrayCopy[oneD][twoD] = doubleArray[oneD][twoD]; 
			}
		}
		System.out.print("\nData in Copied Arrays: " + Arrays.toString(doubleArrayCopy[0]) + Arrays.toString(doubleArrayCopy[1]));
	}
}