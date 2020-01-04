import java.util.Scanner;
public class Quizer {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		UserDataBase userDB = new UserDataBase();

		userDB.getAllUsersInfo();

		System.out.print("New User Name: ");
		String name = input.nextLine();
		userDB.addNewUser(name);
		userDB.getAllUsersInfo();

		// System.out.print("New User Score: ");
		// int score = input.nextInt();
		// userDB.updateUserScore(name,score);
		// userDB.getAllUsersInfo();

		// System.out.print("Remove User Name: ");
		// name = input.nextLine();
		// userDB.removeUser(name);
		// userDB.getAllUsersInfo();

		// System.out.print("Info User Name: ");
		// name = input.nextLine();
		// userDB.getUserInfo(name);
	}
}