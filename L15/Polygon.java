import java.util.Arrays;
public abstract class Polygon extends Shape {

	protected Point vertices[];

	@Override
	public void move(double dx,double dy) {
		for (Point point : vertices) {
			point.move(dx, dy);
		}
	}
	@Override
	public double getPerimeter() {
		double perimeter = 0.0;

		for ( int index = 0; index < vertices.length - 2; index++){
			double distance = vertices[index].distanceTo(vertices[index+1]);
			perimeter += distance;
		}
		perimeter += vertices[vertices.length-1].distanceTo(vertices[0]);
		return perimeter;
	}
	public abstract double getSurface();
	public abstract String toString();
}