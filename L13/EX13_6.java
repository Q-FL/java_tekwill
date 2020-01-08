import java.util.ArrayList;
import java.util.Arrays;
public class EX13_6 {
	public static void main(String[] args) {
		ArrayList<Integer> intArrayOne = new ArrayList<>(Arrays.asList(1, 4, 8, 9, 11, 15, 17, 28, 41, 59));
		ArrayList<Integer> intArrayTwo = new ArrayList<>(Arrays.asList(4, 7, 11, 17, 19, 20, 23, 28, 37, 59, 81));
		System.out.println("Original one: " + intArrayOne + "\nOriginal two: " + intArrayTwo + "\nIntersect: " + intersect(intArrayOne,intArrayTwo));
	}
	static ArrayList<Integer> intersect(ArrayList<Integer> array_one,ArrayList<Integer> array_two){
		ArrayList<Integer> intersectArray = new ArrayList<>();
		for (int nr : array_one){
			if (array_two.contains(nr))
				intersectArray.add(nr);
		}
		return intersectArray;
	}
}