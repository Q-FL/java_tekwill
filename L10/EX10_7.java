public class EX10_7 {
	public static void main(String[]Strings) {
		squareOfAsterisks(5,4,3,2,1);
	}
	static void squareOfAsterisks(int... sizeSeries) {
		for (int size = 0; size < sizeSeries.length; size++){
			for (int length = 0; length < sizeSeries[size]; length++) {
				System.out.print("\n*");
				for (int width = 1; width < sizeSeries[size]; width++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}	
}