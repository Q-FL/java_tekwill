import java.util.concurrent.TimeUnit;

public class EX15_1 {
	public static void main(String[] args) {

		Student student = new Student("Feghea","bd.TekWill","Elev",2020,450.45);
		Staff staff = new Staff("Vasea","bd.TekWill","Hogwarts",2000.20);
		System.out.println(student.toString());
		System.out.println(staff.toString());

	}
}