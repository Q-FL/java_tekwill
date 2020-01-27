public class EX16_1 {
	public static void main(String[] args) {
		Triangle triangle = new Triangle(new Point(0,0),new Point(3,3),new Point(0,6));
		System.out.println(triangle.toString());
		triangle.moveUp(5);
		System.out.println(triangle.toString());

		Circle circle = new Circle(new Point(0,0),5);
		System.out.println(circle.toString());
		circle.moveUp(5);
		System.out.println(circle.toString());

		Rectangle rectangle = new Rectangle(new Point(0,0),4,6);
		System.out.println(rectangle.toString());
		rectangle.moveUp(5);
		System.out.println(rectangle.toString());
	}
}