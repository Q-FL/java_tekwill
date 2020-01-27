import java.time.LocalDateTime;
import java.util.UUID;
public class RandomOutTask extends AbstractTask implements Task {
	private double rand;
	public RandomOutTask() {
		this.rand = Math.random() * 10;
		super.setCreatedAt(LocalDateTime.now());
		super.setId(UUID.randomUUID().toString());
	}
	public void execute() {
		System.out.println(this.rand);
		super.setExecutedAt(LocalDateTime.now());
	}
}