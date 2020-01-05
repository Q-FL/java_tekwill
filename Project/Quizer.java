import java.util.Scanner;
import java.util.Random;
public class Quizer {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		QuestionClass questionDataBase = new QuestionClass();
		boolean flag = true;
		while (flag) {
			int randomInt = rand.nextInt(5) + 1;
			String[] qData = questionDataBase.questionSelector(randomInt);
			boolean flag2 = true;
			while (flag2) {			
				System.out.println(qData[0]+"\n"+qData[1]);

				System.out.print("Chose the right answer: ");
				String userChoice = input.nextLine();
				userChoice = userChoice.toUpperCase();
				
				if (userChoice.equals(qData[2])) {
					System.out.println("YAY!");
					break;
				} else {
					switch (userChoice) {
						default : System.out.println("Wrong Input"); break;
						case "FIFTY" : System.out.println("50/50"); break;
						case "PHONE" : System.out.println("Call a Friend"); break;
						case "ASK" : System.out.println("Ask the Audience"); break;
						case "EXIT" : flag = false; flag2 = false; break;
					}
				}
			}
		}
	}
}