package week1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class TicketPrice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00");

		System.out.print("Enter price for a single ticket: ");
		double priceSingle = readDouble(input);

		System.out.print("Enter price for a season ticket: ");
		double priceSeason = readDouble(input);

		System.out.print("Enter the number of bus trips per month: ");
		double trips = readDouble(input);

		double monthPay = priceSingle * trips;

		if (monthPay > priceSeason) {
			System.out.println(
					"Buying a season ticket is " + (twoDecimals.format(monthPay - priceSeason)) + " euros cheaper.");
		} else if (monthPay == priceSeason) {
			System.out.println("There is no difference in the price.");
		} else
			System.out.println(
					"Buying single tickets is " + (twoDecimals.format(priceSeason - monthPay)) + " euros cheaper.");
	}

	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}
}
