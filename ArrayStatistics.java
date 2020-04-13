
import java.text.DecimalFormat;
import java.util.Scanner;

public class ArrayStatistics {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.0");

		System.out.print("Enter the number of values: ");
		int number = Integer.parseInt(input.nextLine());
		if (number < 3) {
			System.out.println("Sorry, at least 3 values required");
		} else {
			int[] values = new int[number];

			String sampleData = new String();

			for (int i = 0; i < values.length; i++) {
				System.out.print("Enter an integer: ");
				values[i] = Integer.parseInt(input.nextLine());
				sampleData += values[i] + " ";
			}

			System.out.println("\nn = " + values.length);
			System.out.println("Min: " + ArrayStatLibrary.min(values));
			System.out.println("Max: " + ArrayStatLibrary.max(values));
			System.out.println("Median: " + twoDecimals.format(ArrayStatLibrary.median(values)));
			System.out.println("Mean: " + twoDecimals.format(ArrayStatLibrary.mean(values)));
			System.out.println(
					"Sample standard deviation: " + twoDecimals.format(ArrayStatLibrary.standardDeviation(values)));
			System.out.print("Sample data: " + sampleData.trim());

			input.close();
		}
	}
}
