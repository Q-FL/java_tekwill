import java.util.Scanner;
public class EX5_10 {
	public static void main(String[] Strings) {
		Scanner input = new Scanner(System.in);
			System.out.print("Input Number: ");
			int nr = input.nextInt();
			if (nr > 0) {
				for (int start = 1; start <= nr; start++) {
					System.out.print(start + "\n");
				}
				System.out.print("\n");
				for (int start = nr; start >= 1; start--) {
					System.out.print(start + "\n");
				}
			}
			else
				System.out.print("Number should be positive !");
	}
}