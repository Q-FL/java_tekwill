import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;

// To Do: Format the question printing in console, add some colors.
//        Add more questions in data base, split them by 5 levels of difficulty.
//        Construct the final new user/score logic with UserDataBase-Class.

public class Quizer {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		UserDataBase udb = new UserDataBase();

		cls();
		println("\nWelcome to: Who want's to be a Senior Java Developer !\n");
		print("Insert your Name: ");
		String userName = input.nextLine();
		cls();
		if (udb.userExist(userName)) {
			questionApp();
		}
		else {}
	}
	static void questionApp() {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		int userScore = 1;
		int count = 0;

		QuestionClass questionDataBase = new QuestionClass();
		boolean flag2 = true;
		cls();
		while (count < 5 && flag2) {
			int randomInt = rand.nextInt(5) + 1;
			String[] qData = questionDataBase.questionSelector(randomInt);
			boolean flag = true;
			System.out.println("Socer: "+userScore);
			while (flag) {
				System.out.println("\n"+"Question "+(count+1)+": "+qData[0]+"\n"+"\n"+qData[1]+"\n");

				System.out.println(qData[2]);

				System.out.print("Chose the right answer: ");
				String userChoice = input.nextLine();
				userChoice = userChoice.toUpperCase();
				
				if (userChoice.equals(qData[2])) {
					cls();
					System.out.println("YAY!");
					count++; userScore++;
					slp(3);
					cls();
					break;
				} else {
					switch (userChoice) {
						default : cls(); System.out.println("\nWrong Input"); slp(3); cls(); break;
						case "A" : cls(); System.out.println("\nWrong answer :(\nThe right one was: "+qData[2]); count++; --userScore; flag = false; slp(3); cls(); break;
						case "B" : cls(); System.out.println("\nWrong answer :(\nThe right one was: "+qData[2]); count++; --userScore; flag = false; slp(3); cls(); break;
						case "C" : cls(); System.out.println("\nWrong answer :(\nThe right one was: "+qData[2]); count++; --userScore; flag = false; slp(3); cls(); break;
						case "D" : cls(); System.out.println("\nWrong answer :(\nThe right one was: "+qData[2]); count++; --userScore; flag = false; slp(3); cls(); break;
						case "FIFTY" : cls(); System.out.println("\n50/50"); slp(3); cls(); break;
						case "PHONE" : cls(); System.out.println("\nCall a Friend"); slp(3); cls(); break;
						case "ASK" : cls(); System.out.println("\nAsk the Audience"); slp(3); cls(); break;
						case "EXIT" : cls(); flag2 = false; flag = false; break;
					}
				}
			}
		}
		// if (userScore < 0)
		// 	userScore = 0;
		println("Final score:");
		System.out.print(userScore);
	}
	static void cls(){
		final String os = System.getProperty("os.name");
		try {
			if (os.contains("Windows"))
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			else
				Runtime.getRuntime().exec("clear");
		} catch (Exception e){}
	}
	static void slp(int s){
		try {TimeUnit.SECONDS.sleep(s);} catch (Exception e){}
	}
	static void print(String str){System.out.print(str);}
	static void println(String str){System.out.println(str);}
}