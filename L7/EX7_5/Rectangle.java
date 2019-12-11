public class Rectangle {
	int length;
	int width;
	void calcArea() {
		System.out.println("Rectangle area: " + (length * width));
	}
	void calcPerimeter() {
		System.out.println("Rectangle perimeter: " + ((length + width) * 2));
	}
}