// Write a Java program to find the number of even and odd integers in a given array of integers.
import java.util.Arrays;
public class EX6_3_6 {
	public static void main(String[] Strings) {
		int intArray[][] = {{1,2,3,4,9,9},{5,6,7,8,9,9}};
		int countEven = 0;
		int countOdd = 0;
		System.out.print("Data in Arrays: " + Arrays.toString(intArray[0]) + Arrays.toString(intArray[1]));
		for (int oneD = 0; oneD < intArray.length; oneD++) {
			for (int twoD = 0; twoD < intArray[oneD].length; twoD++) {
				if (intArray[oneD][twoD] % 2 == 0)
					countEven++;
				else
					countOdd++;
			}
		}
		System.out.print("\nEven: " + countEven + " Odd: " + countOdd);
	}
}