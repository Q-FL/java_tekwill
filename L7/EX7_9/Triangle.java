public class Triangle {
		int p1_y;
		int p1_x;
		int p2_y;
		int p2_x;
		int p3_y;
		int p3_x;
		void determineType() {
			double l1 = Math.sqrt(Math.pow((p2_x - p1_x),2) + Math.pow((p2_y - p1_y),2));
			double l2 = Math.sqrt(Math.pow((p3_x - p1_x),2) + Math.pow((p3_y - p1_y),2));
			double l3 = Math.sqrt(Math.pow((p2_x - p3_x),2) + Math.pow((p2_y - p3_y),2));
			System.out.print("L1: " + l1 + "\nL2: " + l2 + "\nL3: " + l3);
			if (l1 == l2 && l2 == l3)
				System.out.print("\nTriangle is Equilateral !");
			if (l2 == l3 || l1 == l2 || l3 == l1)
				System.out.print("\nTriangle is Isosceles !");
			else
				System.out.print("\nTriangle is Scalene !");
		}
}