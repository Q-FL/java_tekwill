import java.util.Scanner;
public class EX5_8 {
	public static void main(String[] Strings) {
		// USE CASE METHOD !!!
		Scanner input = new Scanner(System.in);
		System.out.print("Enter operator (+ - / *):");
		String op = input.nextLine();
		System.out.print("Enter first number:");
		int nr1 = input.nextInt();
		System.out.print("Enter second number:");
		int nr2 = input.nextInt();
		switch (op) {
			case "+": int calc1 = nr1 + nr2; System.out.print(nr1 + "+" + nr2 + "=" + calc1); break;
			case "-": int calc2 = nr1 - nr2; System.out.print(nr1 + "-" + nr2 + "=" + calc2); break;
			case "/": double calc3 = (double) nr1 / nr2; System.out.print(nr1 + "/" + nr2 + "=" + calc3); break;
			case "*": double calc4 = (double) nr1 * nr2; System.out.print(nr1 + "*" + nr2 + "=" + calc4); break;
			default : System.out.print("ERROR - Wrong operator input !");
		}
	}
}