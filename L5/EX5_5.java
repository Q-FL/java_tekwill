import java.util.Scanner;
public class EX5_5 {
	public static void main(String[] Strings) {
		Scanner input = new Scanner(System.in);
			System.out.print("Input a day (MON/TUE/WED/THI/FRI/SAT/SUN): ");
			String day = input.nextLine();
			switch (day) {
				case "MON": System.out.print("MON,WED,FRI"); break;
				case "TUE":
				case "WED": System.out.print("WED,FRI"); break;
				case "THI":
				case "FRI": System.out.print("FRI"); break;
				case "SAT":
				case "SUN": System.out.print("No lessons this week :D"); break;
				default : System.out.print("Wrong Input !");
			}
	}
}