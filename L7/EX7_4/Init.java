import java.util.Scanner;
public class Init {
	public static void main(String[] Strings){
		Scanner input = new Scanner(System.in);
		Circle cCircle = new Circle();
		System.out.print("Input Circle radius: ");
		cCircle.radius = input.nextInt();
		cCircle.calcArea();
	}
}