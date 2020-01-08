import java.util.ArrayList;
import java.util.Arrays;
public class EX13_2 {
	public static void main(String[] args) {
		System.out.println("\nEX13_2_1");
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i < 11; i++)
			list.add(i);

		ArrayList<Integer> copy_list = list;

		ArrayList<Integer> for_copy_list = new ArrayList<>();
		for (int e : list)
			for_copy_list.add(e);

		System.out.println("Original list: " + list);
		System.out.println("Copied list with Refference: " + copy_list);
		System.out.println("Copied list with For loop: " + for_copy_list);

		System.out.println("\nEX13_2_2");
		list.clear();

		System.out.println("Original list: " + list);
		System.out.println("Copied list with Refference: " + copy_list);
		System.out.println("Copied list with For loop: " + for_copy_list);

		System.out.println("\nEX13_2_3");
		for_copy_list.set(1,8888);
		System.out.println("Replaced second item with 8888: "+for_copy_list);

		System.out.println("\nEX13_2_4");

		ArrayList<String> strArrayList = new ArrayList<>(Arrays.asList("Write"," a"," method", " removePlurals"," that"," acceptS"," an"," ArrayList"," of"," Strings"," and"," removes"," every"," element"," from"," the"," list"," ending"," with"," an"," 's'", " case-insensitively."));

		System.out.println("String Array with Plurals:" + strArrayList);
		System.out.println("Array with removed Plurals:" + removePlurals(strArrayList));

		System.out.println("\nEX13_2_5");
		System.out.println("Normal strArray:" + strArrayList);
		System.out.println("Reversed words in strArray:" + reverse(strArrayList));

		System.out.println("\nEX13_2_6");
		ArrayList<String> strArrayOne = new ArrayList<>(Arrays.asList("Pif!","Paf!"));
		ArrayList<String> strArrayTwo = new ArrayList<>(Arrays.asList("Pif!","Puf!"));
		System.out.println("String array One: " + strArrayOne + "\nString array Two: " + strArrayTwo);
		System.out.println("Is the same: " + compare(strArrayOne,strArrayTwo));

	}
	static ArrayList<String> removePlurals(ArrayList<String> array){
		ArrayList<String> convArray = new ArrayList<>();
		for (String e : array){
			if (e.endsWith("s") || e.endsWith("S"))
				e = e.substring(0, e.length()-1);
			convArray.add(e);
		}
		return convArray;
	}
	static ArrayList<String> reverse(ArrayList<String> array){
		ArrayList<String> convArray = new ArrayList<>();
		for (String word : array){
			String convWord = "";
			int index = word.length()-1;
			for (;index > -1; index--)
				convWord = convWord + word.charAt(index);
			convArray.add(convWord);
		}
		return convArray;
	}
	static boolean compare(ArrayList<String> arrayOne,ArrayList<String> arrayTwo){
		if (arrayOne.size() == arrayTwo.size()) {
			for (int word_index = 0; word_index < arrayOne.size();word_index++){
				if ((arrayOne.get(word_index)).length() == (arrayTwo.get(word_index)).length()){
					for (int char_index = 0; char_index < (arrayOne.get(word_index)).length(); char_index++){
						if ((arrayOne.get(word_index)).charAt(char_index) == (arrayTwo.get(word_index)).charAt(char_index))
							continue;
						else return false;
					}
				} else return false;
			}
			return true;
		} else return false;
	}
}