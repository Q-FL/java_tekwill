import java.util.*;
public class ListIntReader {

	private Scanner input = new Scanner(System.in);
	private List<Integer> intList = new ArrayList<>();

	public ListIntReader() {
		System.out.print("Input int list: ");
		strToIntList(input.nextLine());
	}
	public List<Integer> getList() {
		return this.intList;
	}
	private void strToIntList(String str) {
		Arrays.asList(str.split(",")).forEach(s -> {if (isNumeric(s)) this.intList.add(Integer.parseInt(s.trim()));});
	}
	private boolean isNumeric(String strNum) {
		if (strNum == null) {
			return false;
		}
		try {
			double d = Double.parseDouble(strNum);
		} 
		catch (NumberFormatException e) {
			System.out.println(e);
			return false;
		}
		return true;
	}
}