import java.util.Scanner;
public class EX10_3 {
	public static void main(String[]Strings) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input Temperature: ");
		double iTemp = input.nextDouble();
		System.out.print("Input type of conversion (c/f): ");
		input.nextLine();
		String iType = input.nextLine();
		if (iType.equals("f"))
			System.out.println(iTemp + " *F into Celsius: " + convertC(iTemp));
		else if (iType.equals("c"))
			System.out.println(iTemp + " *C into Fahrenheit: " + convertF(iTemp));
		else
			System.out.println("Wrong Input !");
	}
	static double convertC(double temp) {
		return ((temp - 32) * 5) / 9;
	}
	static double convertF(double temp) {
		return (1.8 * temp) + 32;
	}
}