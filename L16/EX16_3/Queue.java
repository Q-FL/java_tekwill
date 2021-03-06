import java.util.ArrayList;
public class Queue implements Container {
	private ArrayList<Task> tasks;
	public Queue(ArrayList<Task> tasks) {
		this.tasks = tasks;
	}
	public void push(Task task) {
		tasks.add(tasks.size(),task);
	}
	public Task pop(){
		return tasks.remove(tasks.size()-1);
	}
	public int size(){
		return tasks.size();
	}
	public boolean isEmpty(){
		return tasks.isEmpty();
	}
	public void transferFrom(Container container){
		while (!container.isEmpty()){
			this.push(container.pop());
		}
	}
}