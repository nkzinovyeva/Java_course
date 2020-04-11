package week1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class DrivingCost {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00");

		System.out.print("Enter driven kilometers: ");
		int km = Integer.parseInt(input.nextLine());

		System.out.print("Enter amount of fuel consumed: ");
		double fuel = readDouble(input);

		System.out.print("Enter fuel price per liter: ");
		double price = readDouble(input);

		double cost = (price * fuel) / km;

		System.out.println("The cost per kilometer is " + twoDecimals.format(cost) + " euros.");
	}

	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}
}
