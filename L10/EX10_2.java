public class EX10_2 {
	public static void main(String[]Strings) {
		System.out.println("Parameter Rectangle: " + calculateParameter(4,6));
		System.out.println("Parameter Square: " + calculateParameter(7));
		System.out.println("Area Rectangle: " + calculateArea(3,8));
		System.out.println("Area Square: " + calculateArea(7));
	}	
	static int calculateParameter(int length, int width){
		return (length+width)*2;
	}
	static int calculateParameter(int sideLength){
		return sideLength*4;
	}
	static double calculateArea(int length, double width){
		return length*width;
	}
	static int calculateArea(int sideLength){
		return sideLength*sideLength;
	}
}