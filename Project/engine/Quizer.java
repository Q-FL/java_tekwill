import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;

public class Quizer {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		UserDataBase udb = new UserDataBase();

		cls();
		System.out.println("\nWelcome to: Who want's to be a Senior Java Developer !\n");
		System.out.print("Insert your Name: ");
		String userName = input.nextLine();
		cls();
		if (udb.userExist(userName)) {
			cls();
			System.out.println("\nWelcome Back " + userName);
			slp(2);
			questionApp(udb,userName);
		}
		else {
			cls();
			udb.addNewUser(userName);
			System.out.println("\nWelcome " + userName);
			System.out.println("\n- So basicaly, chose the letter with the right answer.\n- You don't have a second chance in case of wrong answer.\n- Also there are 'fifty / ask / phone' options to help you.");
			slp(10);
			System.out.println("\nGood Luck ^.^");
			slp(2);
			questionApp(udb,userName);
		}
	}
	static void questionApp(UserDataBase udb,String userName) {
		boolean startApp = true;
		while (startApp) {
			Scanner input = new Scanner(System.in);
			int userScore = 0;
			int question_count = 0;
			boolean flagFIFTY = true;
			boolean flagASK = true;
			boolean flagPHONE = true;
			ArrayList<Integer> randomIntList = new ArrayList<>();

			QuestionClass questionDataBase = new QuestionClass();
			boolean flag2 = true;
			cls();
			
			while (question_count < 10 && flag2) {
				randomInt(randomIntList,1,10);
				String[] qData = questionDataBase.questionSelector(randomIntList.get(randomIntList.size()-1));
				boolean flag = true;
				
				while (flag) {
					System.out.println(
						"\nQuestion "+(question_count+1)+": "
						+qData[0]+"\n \n"
						+qData[1]
						+"\n \n|Don't forget about 'fifty / ask / phone' options.|\n"
						);

					System.out.print("Chose the right answer: ");
					String userChoice = input.nextLine();
					userChoice = userChoice.toUpperCase();
					
					if (userChoice.equals(qData[2])) {
						cls();
						System.out.println("\n^.^\nCongrats !\n+1 Point");
						question_count++;
						userScore++;
						System.out.println("\nCurrent Score: " + userScore);
						slp(2);
						cls();
						break;
					} else {
						switch (userChoice) {
							default : cls(); System.out.println("\nWrong Input !\nTry again."); slp(1); cls(); break;
							case "A" : cls(); System.out.println("\n>.<\nNope...Wrong answer"); flag2 = false; flag = false; slp(2); cls(); break;
							case "B" : cls(); System.out.println("\n>.<\nNope...Wrong answer"); flag2 = false; flag = false; slp(2); cls(); break;
							case "C" : cls(); System.out.println("\n>.<\nNope...Wrong answer"); flag2 = false; flag = false; slp(2); cls(); break;
							case "D" : cls(); System.out.println("\n>.<\nNope...Wrong answer"); flag2 = false; flag = false; slp(2); cls(); break;
							case "FIFTY" : {
								if (flagFIFTY){
									cls();
									System.out.println("\n"+"Question "+(question_count+1)+": "+qData[0]);
									System.out.println("\n'50/50':\n \n" + qData[3]);
									flagFIFTY = false;
									slp(7);
									cls();
									break;
								}
								else{
									cls();
									System.out.println("\nNope, you have used '50/50' option !");
									slp(2);
									cls();
									break;
								}
							}
							case "ASK" : {
								if (flagASK) {
									cls();
									System.out.println("\n"+"Question "+(question_count+1)+": "+qData[0]);
									System.out.println("\nThe audience thinks:\n \n" + qData[4]);
									flagASK = false;
									slp(7);
									cls();
									break;
								}
								else {
									cls();
									System.out.println("\nNope, you have used 'Ask the Audience' option !");
									slp(2);
									cls();
									break;
								}
							}
							case "PHONE" : {
								if (flagPHONE) {
									cls();
									System.out.println("\n"+"Question "+(question_count+1)+": "+qData[0]);
									System.out.println("\nVoice on Phone says:\n \n" + qData[5]);
									flagPHONE = false;
									slp(7);
									cls();
									break;
								}
								else {
									cls();
									System.out.println("\nNope, you have used 'Call a Friend' option !");
									slp(2);
									cls();
									break;
								}
							}
						}
					}
				}
			}
			udb.updateUserScore(userName,userScore);
			while (true){
				cls();
				System.out.println("\nThe End.\n");
				udb.getUserInfo(userName);
				System.out.println("\n" + progressMeasure(userScore) + "\n");
				System.out.print("Again? (y/n): ");
				String again = input.nextLine();
				if (again.toLowerCase().equals("y")) {
					break;
				}
				else if (again.toLowerCase().equals("n")) {
					System.out.println("\nBye-Bye!");
					slp(1);
					startApp = false;
					break;
				}
				else {
					System.out.print("Wrong Input !");
					slp(1);
				}
			}
		}
	}
	static void randomInt(ArrayList<Integer> list,int start, int end) {
		Random rand = new Random();
		while(true){
			int randomNr = rand.nextInt(end) + start;
			if (!list.contains(randomNr)){
				list.add(randomNr);
				break;
			}
		}
	}
	static String progressMeasure(int score){
		switch (score) {
			default : break;
			case 10 : return "YAY, you passed !\nNow you can call yourself the: Senior Java Dev.\n^.^";
			case 9 : 
			case 8 : return "Ho ho ! Pretty dam close ! :D";
			case 7 :
			case 6 : return "You can call yourself Mid-Senior.";
			case 5 :
			case 4 : return "Hmm... Maybe-Maybe.";
			case 3 :
			case 2 : return "Ouch... You can do better !";
			case 1 :
			case 0 : return "Well, at leas you tried.";
		}
		return "|ERROR|";
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
	static void slp(int s){try {TimeUnit.SECONDS.sleep(s);} catch (Exception e){}}
}