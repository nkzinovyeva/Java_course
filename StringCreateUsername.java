

import java.util.Scanner;

public class StringCreateUsername {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first name: ");
		String name = input.nextLine();

		System.out.print("Enter surname: ");
		String surname = input.nextLine();

		String username = createUsername(name, surname);

		if (username == null) {
			System.out.print("Not enough letters to create a username!");
		} else {
			System.out.print(username);
		}
		input.close();
	}

	private static String createUsername(String name, String surname) {

		String outputText = "";

		if (name.length() < 3 || surname.length() < 3) {
			return null;
		} else {
			for (int i = 0; i < 3; i++) {
				outputText += surname.charAt(i);
			}
			for (int i = 0; i < 2; i++) {
				outputText += name.charAt(i);
			}
			return outputText.toLowerCase();

		}
	}
}
