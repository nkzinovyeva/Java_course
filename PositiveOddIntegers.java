
import java.util.Scanner;

public class PositiveOddIntegers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a positive odd integer: ");
		String text = input.nextLine();

		while (text.equals("quit") == false) {
			try {
				int x = Integer.parseInt(text);
				if (x > 0 && x % 2 == 1) {
					System.out.println("  OK\n");
					System.out.print("Enter a positive odd integer: ");
					text = input.nextLine();
				} else {
					System.out.println("  " + x + " is not a positive odd integer\n");
					System.out.print("Enter a positive odd integer: ");
					text = input.nextLine();
				}
			} catch (NumberFormatException nfe) {
				System.out.println("  '" + text + "' is not a positive odd integer\n");
				System.out.print("Enter a positive odd integer: ");
				text = input.nextLine();
			}

		}
		System.out.println("  Bye!");
		input.close();
	}
}
