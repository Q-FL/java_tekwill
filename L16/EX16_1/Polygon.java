import java.util.*;
abstract class Polygon implements IMovable {
	List<Point> vertices = new ArrayList<>();
	public void moveUp(int distance) {
		for (int index = 0; index < vertices.size(); index++) {
			vertices.get(index).setY(vertices.get(index).getY() + distance);
		}
	}
	public void moveDown(int distance) {
		for (int index = 0; index < vertices.size(); index++) {
			vertices.get(index).setY(vertices.get(index).getY() - distance);
		}
	}
	public void moveLeft(int distance) {
		for (int index = 0; index < vertices.size(); index++) {
			vertices.get(index).setX(vertices.get(index).getX() + distance);
		}
	}
	public void moveRight(int distance) {
		for (int index = 0; index < vertices.size(); index++) {
			vertices.get(index).setX(vertices.get(index).getX() - distance);
		}
	}
	public String toString() {
		return getClass().getName() + " " + Arrays.toString(vertices.toArray());
	}
}