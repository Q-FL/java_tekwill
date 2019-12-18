class CounterClass {
	private static int count = 0;
	static void countAdd() {
		count++;
	}
	static void countPrint() {
		System.out.println("Method countAdd() was used: " + count);
	}
}
public class EX9_2 {
	public static void main(String[] Strings) {
		for (int i = 0; i < 5; i++)
			CounterClass.countAdd();
		CounterClass.countPrint();
	}
}