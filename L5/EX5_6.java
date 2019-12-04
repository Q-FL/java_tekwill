import java.util.Scanner;
public class EX5_6 {
	public static void main(String[] Strings) {
		Scanner input = new Scanner(System.in);
			System.out.print("Input Number: ");
			int nr = input.nextInt();
			switch (nr) {
				case 1: System.out.print("Its Monday !"); break;
				case 2: System.out.print("Its Tuesday !"); break;
				case 3: System.out.print("Its Wednesday !"); break;
				case 4: System.out.print("Its Thursday !"); break;
				case 5: System.out.print("Its Friday !"); break;
				case 6: System.out.print("Its Saturday !"); break;
				case 7: System.out.print("Its Sunday !"); break;
			}
	}
}