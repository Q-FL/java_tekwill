import java.time.LocalDateTime;
import java.util.UUID;
public class CounterOutTask extends AbstractTask implements Task {
	private static int counter = 0;
	public CounterOutTask() {
		super.setCreatedAt(LocalDateTime.now());
		super.setId(UUID.randomUUID().toString());
	}
	public void execute() {
		this.counter++;
		System.out.println(this.counter);
		super.setExecutedAt(LocalDateTime.now());
	}
}