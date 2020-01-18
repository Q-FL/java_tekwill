public abstract class Shape {
	protected Color color;

	public Color getColor() {
		return this.color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public abstract void move(double dx,double dy);
	public abstract double getSurface();
	public abstract double getPerimeter();
}