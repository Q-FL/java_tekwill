interface Container {
	Task pop();
	void push(Task task);
	int size();
	boolean isEmpty();
	void transferFrom(Container container);
}