import java.util.Scanner;
public class EX5_4 {
	public static void main(String[] Strings) {
		Scanner input = new Scanner(System.in);
			System.out.print("Input a number: ");
			int mounth = input.nextInt();
			switch (mounth) {
				case 1 : System.out.print("Ianuarie"); break; 
				case 2 : System.out.print("Februarie"); break; 
				case 3 : System.out.print("Martie"); break; 
				case 4 : System.out.print("Aprilie"); break; 
				case 5 : System.out.print("Mai"); break; 
				case 6 : System.out.print("Iunie"); break; 
				case 7 : System.out.print("Iulie"); break; 
				case 8 : System.out.print("August"); break; 
				case 9 : System.out.print("Septembrie"); break; 
				case 10 : System.out.print("Octombrie"); break; 
				case 11 : System.out.print("Noiembrie"); break; 
				case 12 : System.out.print("Decembrie"); break; 
				default : System.out.print("Wrong format !"); 
			}
	}
}