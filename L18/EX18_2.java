import java.util.function.Predicate;
public class EX18_2 {
	public static void main(String[] args) {
		StringValidator containsString = i -> i.contains("knowledge");
		StringValidator lengthString = i -> i.length() > 10;
		StringValidator notNullString = i -> i != null;
		StringValidator notEmptySpacesString = i -> !i.contains(" ");
		System.out.println(containsString.validate("knowledge"));
		System.out.println(lengthString.validate("12345678910"));
		System.out.println(notNullString.validate(null));
		System.out.println(notEmptySpacesString.validate(" "));

		Predicate<String> containsStringP = i -> i.contains("knowledge");
		Predicate<String> lengthStringP = i -> i.length() > 10;
		Predicate<String> notNullStringP = i -> i != null;
		Predicate<String> notEmptySpacesStringP = i -> !i.contains(" ");
		System.out.println(containsStringP.test("knowledge"));
		System.out.println(lengthStringP.test("12345678910"));
		System.out.println(notNullStringP.test(null));
		System.out.println(notEmptySpacesStringP.test(" "));
	}
}