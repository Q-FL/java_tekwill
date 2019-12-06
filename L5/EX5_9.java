import java.util.Scanner;
public class EX5_9 {
	public static void main(String[] Strings) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input your mark: ");
		double mark = input.nextDouble();
		if (mark > 0 && mark <= 10) {
			if (mark >= 9) 
				System.out.print(mark + " = I'm proud of you !");	
			if (9 > mark && mark >= 7) 
				System.out.print(mark + " = Very good !");
			if (7 >= mark && mark >= 6) 
				System.out.print(mark + " = Good.");
			if (6 >= mark && mark >= 5) 
				System.out.print(mark + " = Approved.");
			if (mark < 5) 
				System.out.print(mark + " = Fail !");
		}
		else
			System.out.print("Wrong Input !");
	}
}