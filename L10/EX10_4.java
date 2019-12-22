import java.util.Scanner;
public class EX10_4 {
	public static void main(String[]Strings){
		Scanner input = new Scanner(System.in);
		System.out.print("Input radius: ");
		double radius = input.nextDouble();
		System.out.println("Sphere Volume: " + sphereVolume(radius));
	}
	static double sphereVolume(double radius) {
		return (double) (4.0 / 3.0) * Math.PI * Math.pow(radius,3);
	}
}