public class Triangle extends Polygon {
	Triangle(Point cornerOne, Point cornerTwo, Point cornerThree) {
		vertices = new Point[3];
		vertices[0] = cornerOne;
		vertices[1] = cornerTwo;
		vertices[2] = cornerThree;
	}
	public boolean isIsosceles() {
		double l1 = vertices[0].distanceTo(vertices[1]);
		double l2 = vertices[1].distanceTo(vertices[2]);
		double l3 = vertices[2].distanceTo(vertices[0]);
		return l2 == l3 || l1 == l2 || l3 == l1;
	}
	public boolean isEquilateral() {
		double l1 = vertices[0].distanceTo(vertices[1]);
		double l2 = vertices[1].distanceTo(vertices[2]);
		double l3 = vertices[2].distanceTo(vertices[0]);
		return l1 == l2 && l2 == l3;
	}
	public boolean isRight() {

		return vertices[0].getX() == vertices[1].getX() && vertices[0].getY() == vertices[2].getY()
			|| vertices[0].getY() == vertices[1].getY() && vertices[1].getX() == vertices[2].getX()
			|| vertices[0].getY() == vertices[2].getY() && vertices[1].getX() == vertices[2].getX();
	}
	@Override
	public double getSurface() {
		double l1 = vertices[0].distanceTo(vertices[1]);
		double l2 = vertices[1].distanceTo(vertices[2]);
		double l3 = vertices[2].distanceTo(vertices[0]);

		double perimeter = super.getPerimeter();
		double s = perimeter / 2;
		return Math.sqrt(s * (s - l1) * (s - l2) * (s - l3));
	}
	@Override
	public String toString() {
		return "Triangle:\nIs Isosceles: " + isIsosceles() + "\nIs Right: " + isRight() + "\nIs ";
	}
}