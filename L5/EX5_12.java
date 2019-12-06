import java.util.Scanner;
public class EX5_12 {
	public static void main(String[] Strings) {
		Scanner input = new Scanner(System.in);
			int suma = 0;
			int count = 0;
			int nr = 1;
			while (nr != 0) {
				System.out.print("Input Number: ");
				nr = input.nextInt();
				suma += nr;
				count++;
			}
			System.out.print("Suma: " + suma + " Numere introduse: "+ (count - 1));
	}
}