public class Circle extends Shape {
	private Point point;
	private int radius;

	Circle(Point center,int radius) {
		this.point = new Point(center);
		this.radius = radius;
	}
	public double getDiameter() {
		return this.radius * 2;
	}
	@Override
	public void move(int dx,int dy) {}
	@Override
	public double getSurface() {
		return Math.PI * Math.pow(this.radius,2);
	}
	@Override
	public double getPerimeter() {
		return Math.PI * getDiameter();
	}
	public String toString() {
		return "Circle:\nRadius = "+this.radius+"\nSurface = "+getSurface()+"\nPerimeter = "+getPerimeter();
	}
}