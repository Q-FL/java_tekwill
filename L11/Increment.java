public class Increment {
	private static int count;
	Increment() {
		count++;
	}
	void printCount() {
		System.out.println("Called: "+count);
	}
}