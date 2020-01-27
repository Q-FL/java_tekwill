import java.time.LocalDateTime;
public abstract class AbstractTask {
	private String id;
	private LocalDateTime createdAt;
	private LocalDateTime executedAt;

	public void setId(String id) {
		this.id = id;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public void setExecutedAt(LocalDateTime executedAt) {
		this.executedAt = executedAt;
	}
	public String toString() {
		return getClass().getName()+ "\nId: " + this.id + "\ncreatedAt: " + this.createdAt + "\nexecutedAt: " + this.executedAt;
	}
}