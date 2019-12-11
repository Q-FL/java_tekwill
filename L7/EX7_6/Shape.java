public class Shape {
	public static void main(String[] Strings) {	
		Circle cCircle = new Circle();
		Rectangle cRectangle = new Rectangle();
		cCircle.radius = 5;
		cRectangle.length = 10;
		cRectangle.width = 20;
		cCircle.calcArea();
		cRectangle.calcArea();
		cRectangle.calcPerimeter();
	}
}