import java.util.Scanner;
public class EX10_8 {
	public static void main(String[]Strings) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input Square Size: ");
		int iSize = input.nextInt();
		System.out.print("Input Square Material: ");
		char iFill = input.next().charAt(0);
		squareOfAsterisks(iFill,iSize);
	}
	static void squareOfAsterisks(char fill,int size) {
		for (int length = 0; length < size; length++) {
			System.out.print("\n"+fill);
			for (int width = 1; width < size; width++) {
				System.out.print(fill);
			}
		}
	}	
}