package week1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class AgentCommission {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00");

		System.out.print("Enter selling price: ");
		double price = readDouble(input);

		double comm = price / 100 * 3.44;

		if (comm < 2400) {
			System.out.println("The commission is 2400,00 euros.");
		} else
			System.out.println("The commission is " + twoDecimals.format(comm) + " euros.");

	}

	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}
}
