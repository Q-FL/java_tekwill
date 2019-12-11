import java.util.Scanner;
public class Init {
	public static void main(String[] Strings) {
		Scanner input = new Scanner(System.in);
		Triangle cTriangle = new Triangle();
		System.out.print("Input coordinate Y for p1: ");
		cTriangle.p1_y = input.nextInt();
		System.out.print("Input coordinate X for p1: ");
		cTriangle.p1_x = input.nextInt();
		System.out.print("Input coordinate Y for p2: ");
		cTriangle.p2_y = input.nextInt();
		System.out.print("Input coordinate X for p2: ");
		cTriangle.p2_x = input.nextInt();
		System.out.print("Input coordinate Y for p3: ");
		cTriangle.p3_y = input.nextInt();
		System.out.print("Input coordinate X for p3: ");
		cTriangle.p3_x = input.nextInt();
		cTriangle.determineType();
	}
}