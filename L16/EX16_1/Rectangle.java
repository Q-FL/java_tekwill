import java.util.*;
public class Rectangle extends Polygon {
	public Rectangle(Point topRightCorner,int width,int height) {
		Point topLeftCorner = new Point(topRightCorner.getX() - width, topRightCorner.getY());
		Point bottomLeftCorner = new Point(topLeftCorner.getX(), topLeftCorner.getY() - height);
		Point bottomRightCorner = new Point(bottomLeftCorner.getX() + width, bottomLeftCorner.getY());

		vertices.add(topRightCorner);
		vertices.add(topLeftCorner);
		vertices.add(bottomLeftCorner);
		vertices.add(bottomRightCorner);
	}
}