public class EX18_1 {
	public static void main(String[] args) {
		DoubleValidator greaterZero = i -> i > 0;
		DoubleValidator equalZero = i -> i == 0;
		DoubleValidator evenZero = i -> i % 2 == 0;
		System.out.println(greaterZero.validate(-1));
		System.out.println(equalZero.validate(0));
		System.out.println(evenZero.validate(4));

		PredicateValidator greaterZeroP = i -> i > 0;
		PredicateValidator equalZeroP = i -> i == 0;
		PredicateValidator evenZeroP = i -> i % 2 == 0;
		System.out.println(greaterZeroP.test(-1));
		System.out.println(equalZeroP.test(0));
		System.out.println(evenZeroP.test(4));
	}
}