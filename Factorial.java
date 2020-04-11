
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a non-negative integer: ");
		try {
			int x = Integer.parseInt(input.nextLine());

			if (x == 0) {
				System.out.println("0! = 1");
			} else if (x < 0) {
				System.out.println("Please enter a non-negative integer.");
			} else {
				int factorial = 1;
				for (int i = x; i >= 1; i--) {
					factorial = factorial * i;
				}
				System.out.println(x + "! = " + factorial);

			}
		} catch (NumberFormatException nfe) {
			System.out.println("Please enter a non-negative integer.");
		}
		input.close();
	}
}
