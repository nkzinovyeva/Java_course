
import java.util.Scanner;

public class MethodsSecond {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter width: ");
		int width = Integer.parseInt(input.nextLine());
		System.out.print("Enter height: ");
		int heigth = Integer.parseInt(input.nextLine());
		System.out.print("\n");

		printRectangle("x", width, heigth);
		input.close();
	}

	private static void printRectangle(String message, int w, int h) {
		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= w; j++) {
				System.out.print(message);
			}
			System.out.println();
		}
	}
}
