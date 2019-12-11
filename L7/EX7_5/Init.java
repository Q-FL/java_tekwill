import java.util.Scanner;
public class Init {
	public static void main(String[] Strings){
		Scanner input = new Scanner(System.in);
		Rectangle cRectangle = new Rectangle();
		System.out.print("Input Rectangle length: ");
		cRectangle.length = input.nextInt();
		System.out.print("Input Rectangle width: ");
		cRectangle.width = input.nextInt();
		cRectangle.calcArea();
		cRectangle.calcPerimeter();
	}
}