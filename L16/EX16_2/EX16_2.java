import java.util.ArrayList;
public class EX16_2 {
	public static void main(String[] args) {
		ArrayList<Task> array = new ArrayList<>();
		array.add(new OutTask("Yeeeee Boyyyyyy !!!"));
		array.add(new RandomOutTask());
		array.add(new CounterOutTask());
		for (Task obj : array) {
			obj.execute();
			System.out.println(obj + "\n");
		}
		// CounterOutTask count = new CounterOutTask();
		// count.execute();
		// count.execute();
		// count.execute();
		// count.execute();
		// System.out.println(count);
	}
}