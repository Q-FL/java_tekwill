import java.util.Scanner;
public class Init {
	public static void main(String[] Strings){
		Scanner input = new Scanner(System.in);
		Point cPoint = new Point();
		System.out.print("Input coordinate x: ");
		cPoint.x = input.nextDouble();
		System.out.print("Input coordinate y: ");
		cPoint.y = input.nextDouble();
		cPoint.quadrant();
	}
}