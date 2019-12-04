import java.util.Scanner;
public class EX5_11 {
	public static void main(String[] Strings) {
		Scanner input = new Scanner(System.in);
			System.out.print("Input Number: ");
			int nr = input.nextInt();
			if (nr > 0) {
				for (int start = 1; start <= nr; start++) {
					if (start % 2 == 0) {
						System.out.print(start + "\n");
					}
				}
			}
			else
				System.out.print("Number should be bigger than 0 !");
	}
}