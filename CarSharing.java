
import java.util.Scanner;
import java.text.DecimalFormat;

public class CarSharing {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00");

		System.out.print("Enter driven kilometers: ");
		int km = Integer.parseInt(input.nextLine());

		System.out.print("Enter fuel consumption per 100 km: ");
		double fuel = readDouble(input);

		System.out.print("Enter fuel price per liter: ");
		double price = readDouble(input);

		System.out.print("Enter number of people: ");
		int person = Integer.parseInt(input.nextLine());

		double cost = (km / 100 * fuel * price) / person;

		System.out.println("Each of the " + person + " people should pay " + twoDecimals.format(cost) + " euros.");
	}

	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}
}
