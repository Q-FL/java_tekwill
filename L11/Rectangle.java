public class Rectangle {
	int length = 0;
	int width = 0;
	Rectangle(){
		this(0);
	}
	Rectangle(int singleParam) {
		this(singleParam,singleParam);
	}
	Rectangle(int iLength,int iWidth) {
		this.length = iLength;
		this.width = iWidth;
	}
	public void calcArea(){
		System.out.println("Area: " + (length*width));
	}
}