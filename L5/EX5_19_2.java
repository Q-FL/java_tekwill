import java.util.Scanner;
public class EX5_19_2 {
	public static void main(String[] Strings) {
		Scanner input = new Scanner(System.in);
			int i = 1;
			int sum = 0;
			int count = 0;
			for (; i != 0; sum = sum + i) {
				System.out.print("Input Number: ");
				i = input.nextInt();
				count++;
			}
			System.out.print("Suma: " + sum + " Numere introduse: "+ (count - 1));
	}
}