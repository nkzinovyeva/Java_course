
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00");

		System.out.print("Enter initial deposit: ");
		BigDecimal deposit = new BigDecimal(input.nextLine().replace(',', '.'));

		System.out.print("Enter interest rate: ");
		BigDecimal interest = new BigDecimal(input.nextLine().replace(',', '.'));

		System.out.print("Enter capital income tax rate: ");
		BigDecimal incomeTax = new BigDecimal(input.nextLine().replace(',', '.'));

		System.out.print("Enter number of years: ");
		int years = Integer.parseInt(input.nextLine());

		for (int i = 1; i <= years; i++) {
			BigDecimal procent = ((deposit.multiply(interest)).divide(new BigDecimal(100)));
			BigDecimal income = procent.subtract((procent.multiply(incomeTax)).divide(new BigDecimal(100)));
			deposit = deposit.add(income);
			System.out.println(i + ":" + twoDecimals.format(deposit));
		}

		input.close();
	}
}
