import java.util.*;
public class ListIntReader {

	private Scanner input = new Scanner(System.in);
	private List<Integer> intList = new ArrayList<>();

	public ListIntReader() {
		System.out.print("Input int list: ");
		strToIntList(input.nextLine());
	}
	public int getListSum() {
		return this.intList.stream().mapToInt(Integer::intValue).sum();
	}
	private void strToIntList(String str) {
		Arrays.asList(str.split(",")).forEach(s -> {try {this.intList.add(Integer.parseInt(s.trim()));} catch (NumberFormatException e) {System.out.println(e);}});
	}
}