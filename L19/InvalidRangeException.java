public class InvalidRangeException extends Exception {
	@Override
	public String getMessage() {
		return "Invalid range: minimum is greater than or equal to maximum";
	}
}