
import java.time.LocalDate;
import java.util.Scanner;

public class MethodsPrintCalendar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter year: ");
		int year = Integer.parseInt(input.nextLine());

		System.out.print("Enter month: ");
		int month = Integer.parseInt(input.nextLine());

		printCalendar(year, month);
		
		input.close();

	}

	private static void printCalendar(int year, int month) {

		int day = 1;

		String[] monthName = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		int monthArray = month - 1;

		System.out.println("\n > " + monthName[monthArray] + " " + year + " <");
		System.out.println(" Mon Tue Wed Thu Fri Sat Sun");

		LocalDate myDate = LocalDate.of(year, month, day);

		int daysInMonth = myDate.lengthOfMonth();

		int dayOfWeek = myDate.getDayOfWeek().getValue();

		for (int i = 1; i < dayOfWeek; i++) {
			System.out.print("    ");
		}

		for (int i = 0; i <= (7 - dayOfWeek); i++) {

			System.out.printf("%4d", day);
			day++;
		}

		while (day <= daysInMonth) {
			System.out.println();
			for (int j = 1; j <= 7; j++) {
				if (day <= daysInMonth) {
					System.out.printf("%4d", day);
					day++;
				}
			}

		}
		System.out.println();
	}

}
