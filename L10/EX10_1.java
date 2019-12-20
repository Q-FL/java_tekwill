class isPositive {
	static boolean typeValue(int val) {
		return val>0;
	}
}
public class EX10_1 {
	public static void main(String[] Strings) {
		System.out.println("Is Number Positive: " + isPositive.typeValue(-5));
	}
}