

import java.util.Scanner;

public class RegExValidateUsernameFormat {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter username: ");
		String username = input.nextLine();

		if (username.matches("[a]{1}[0-9]{7}(@myy\\.haaga-helia\\.fi)") == true) {
			System.out.println("OK");
		} else {
			System.out.println("Invalid username format");
		}
		input.close();
	}

}