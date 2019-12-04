import java.util.Scanner;
public class EX5_7 {
	public static void main(String[] Strings) {
		Scanner input = new Scanner(System.in);
			System.out.print("Input a day (MON/TUE/WED/THI/FRI/SAT/SUN): ");
			String day = input.nextLine();
			switch (day) {
				case "SUN":
				case "SAT":
				case "FRI": System.out.print("MON,WED,FRI"); break;
				case "THI":
				case "WED": System.out.print("MON,WED"); break;
				case "TUE":
				case "MON": System.out.print("MON"); break;
				default : System.out.print("Wrong Input !");
			}
	}
}