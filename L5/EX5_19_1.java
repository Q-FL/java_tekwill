import java.util.Scanner;
public class EX5_19_1 {
	public static void main(String[] Strings) {
		int count = 0;
		int sum = 1;
		while (count < 101) {
			sum += count;
			count++;
			System.out.print("Count: " + count + " | Sum: " + sum + "\n");
		}
		System.out.print("Total sum: " + sum);
	}
}
