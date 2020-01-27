public class Circle implements IMovable {
	private Point point;
	private int radius;
	Circle(Point point,int radius) {
		this.point = point;
		this.radius = radius;
	}
	public void moveUp(int distance) {
		point.setY(point.getY() + distance);
	}
	public void moveDown(int distance) {
		point.setY(point.getY() - distance);
	}
	public void moveLeft(int distance) {
		point.setX(point.getX() + distance);
	}
	public void moveRight(int distance) {
		point.setX(point.getX() - distance);		
	}
	public String toString() {
		return "Circle: " + this.point.toString()+ " Radius: " + this.radius;
	}

}