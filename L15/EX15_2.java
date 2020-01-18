public class EX15_2 {
	public static void main(String[] args) {
		Circle circle = new Circle(new Point(1),5);
		System.out.println(circle.toString());

		Rectangle rectangle = new Rectangle(new Point(5, 5), 3, 2);
		System.out.println(rectangle.toString());
	}
}