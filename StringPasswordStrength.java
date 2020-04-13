
import java.util.Scanner;

public class StringPasswordStrength {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter password: ");
		String password = input.nextLine();

		if (checkStrength(password) == true) {
			System.out.println("OK");
		} else {
			System.out.println("Not strong enough!");
		}
		input.close();

	}

	public static boolean checkStrength(String password) {
		if (password.length() >= 8) {
			int counter = 0;

			if (password.matches(".{0,}\\d{1,}.{0,}")) {
				counter++;
			}
			if (password.matches(".{0,}[\\W_].{0,}")) {
				counter++;
			}
			if (password.matches(".{0,}[a-z]{1,}.{0,}")) {
				counter++;
			}
			if (password.matches(".{0,}[A-Z]{1,}.{0,}")) {
				counter++;
			}
			if (counter < 3) {
				return false;
			} else {
				return true;
			}
		} else {
			return false;
		}

	}

}
