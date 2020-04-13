
import java.text.DecimalFormat;
import java.util.Scanner;

public class ArrayGrossPayCalculation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		
		String dayString = "";
		double overTime = 0;
		int hours = 0;

		System.out.print("Enter your hourly wage: ");
		double wage = readDouble(input);

		System.out.print("Enter the number of days: ");
		int day = Integer.parseInt(input.nextLine());

		String[] daysArray = new String[day];

		for (int i = 0; i < daysArray.length; i++) {
			System.out.print("Hours worked on day " + (i + 1) + ": ");
			daysArray[i] = input.nextLine();

			int hoursCheck = Integer.parseInt(daysArray[i]);

			hours += hoursCheck;

			dayString += hoursCheck + " ";

			if (hoursCheck > 8) {
				overTime += (hoursCheck - 8) * (wage * 0.5);
			}
		}

		System.out.println("\nTotal work hours is " + hours);

		double gross = (wage * hours) + overTime;

		System.out.println("Gross pay is " + twoDecimals.format(gross));

		System.out.println("You entered the following daily hours: " + dayString);

		input.close();

	}

	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}

}
