import java.util.*;
public class Triangle extends Polygon {
	Triangle(Point cornerOne, Point cornerTwo, Point cornerThree) {
		vertices.add(cornerOne);
		vertices.add(cornerTwo);
		vertices.add(cornerThree);
	}
}