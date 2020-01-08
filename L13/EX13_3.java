import java.util.ArrayList;
import java.util.Arrays;
public class EX13_3 {
	public static void main(String[] args) {
		ArrayList<String> strArray = new ArrayList<>(Arrays.asList("to", "be", "or", "not", "to", "be","hamlet"));
		System.out.print("Original: " + strArray + "\nSwitched: " + switchPairs(strArray));
	}
	static ArrayList<String> switchPairs(ArrayList<String> array){
		ArrayList <String> convArray = new ArrayList<>();
		for (int word_index = 0; word_index < array.size(); word_index++){
			try{
				convArray.add(array.get(word_index+1));
				convArray.add(array.get(word_index));
				word_index++;
			}catch (Exception e){
				convArray.add(array.get(word_index));
			}
		}
		return convArray;
	}
}