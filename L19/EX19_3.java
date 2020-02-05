public class EX19_3 {
	public static void main(String[] args) throws InvalidHexException {
		String str = "abc";
		try {
			Integer.parseInt(str,16);
		} catch (NumberFormatException e) {
			throw new InvalidHexException();
		}
	}
}