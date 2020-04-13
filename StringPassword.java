
import java.util.Scanner;

public class StringPassword {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter username: ");
		String user = input.nextLine();

		System.out.print("Enter password: ");
		String password = input.nextLine();

		if (validatePassword(user, password) == true) {
			System.out.print("OK");
		} else {
			System.out.print("NOT OK");
		}

		input.close();

	}

	private static boolean validatePassword(String user, String password) {
		if (password.length() < 8) {
			return false;
		} else if (password.contains(user.toLowerCase()) == true) {
			return false;
		} else
			return true;
	}

}
