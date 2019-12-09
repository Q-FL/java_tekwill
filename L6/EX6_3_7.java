// Write a Java program to check if two arrays are equal: check both the length and the values.
import java.util.Arrays;
public class EX6_3_7 {
	public static void main(String[] Strings) {
		int intFirstArray[][] = {{1,2,3,4},{5,6,7,8}};
		System.out.print("Data in First Arrays: " + Arrays.toString(intFirstArray[0]) + Arrays.toString(intFirstArray[1]));
		int intSecondArray[][] = {{1,2,3,4},{5,6,7,8,9}};
		System.out.print("\nData in Second Arrays: " + Arrays.toString(intSecondArray[0]) + Arrays.toString(intSecondArray[1]));
		int equalData = 0;
		for (int oneD = 0; oneD < intFirstArray.length; oneD++) {
			if (intFirstArray[oneD].length == intSecondArray[oneD].length)
				System.out.print("\nArray index "+oneD+" length is equal to Second Array length.");
			for (int twoD = 0; twoD < intFirstArray[oneD].length; twoD++) {
				if (intFirstArray[oneD][twoD] == intSecondArray[oneD][twoD])
					equalData++;
			}
		}
		System.out.print("\nThere are "+equalData+" equal values.");
	}
}