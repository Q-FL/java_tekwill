import java.time.LocalDateTime;
import java.util.UUID;
public class OutTask extends AbstractTask implements Task {
	private String msg;
	public OutTask(String msg) {
		this.msg = msg;
		super.setCreatedAt(LocalDateTime.now());
		super.setId(UUID.randomUUID().toString());
	}
	public void execute() {
		System.out.println(this.msg);
		super.setExecutedAt(LocalDateTime.now());
	}
}