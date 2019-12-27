public class Student {
	private String name;
	Student() {
		this("Unknown");
	}
	Student(String nameC) {
		name = nameC;
	}
	void printName() {
		System.out.println(name);
	}
}