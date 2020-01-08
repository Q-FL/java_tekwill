import java.util.ArrayList;
import java.util.Arrays;
public class EX13_4 {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("this", "is", "lots", "of", "for", "every", "Java", "programmer"));
		System.out.println("Original: " + arrayList + "\nAsteriks: " + markLength4(arrayList));
	}
	static ArrayList<String> markLength4(ArrayList<String> array){
		ArrayList<String> convArray = new ArrayList<>();
		for (String word : array){
			if (word.length() == 4)
				convArray.add("****" + word);
			else
				convArray.add(word);
		}
		return convArray;
	}
}