import java.util.ArrayList;
import java.util.Arrays;
public class EX13_5 {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("the", "quick", "brown", "fox"));
		System.out.println("Original: " + arrayList + "\nWith Asteriks: " + addStars(arrayList));
	}
	static ArrayList<String> addStars(ArrayList<String> array){
		ArrayList<String> convArray = new ArrayList<>();
		for (String word : array){
			convArray.add(word);
			convArray.add("*");
		}
		return convArray;
	}
}