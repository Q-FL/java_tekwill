public class Point {
	double x;
	double y;
	void quadrant() {
		if (x > 0 && y > 0)
			System.out.print("Point is on 1st Quadrant.");
		if (x < 0 && y > 0)
			System.out.print("Point is on 2nd Quadrant.");
		if (x < 0 && y < 0)
			System.out.print("Point is on 3nd Quadrant.");
		if (x > 0 && y < 0)
			System.out.print("Point is on 4nd Quadrant.");
		if (x == 0 && y == 0)
			System.out.print("Point is on 0.");
	}
}