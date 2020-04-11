
import java.text.DecimalFormat;
import java.util.Scanner;

public class MethodsThird {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00");

		System.out.print("Enter gross salary: ");
		double salary = readDouble(input);

		System.out.print("Enter income tax rate: ");
		double taxRate = readDouble(input);
		System.out.print("\n");

		double netSalary = calculateNetSalary(salary, taxRate);
		System.out.println("The net salary is " + twoDecimals.format(netSalary));

	}

	private static double calculateNetSalary(double salary, double rate) {
		return (salary - (salary * rate / 100));
	}

	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}
}
