
import java.util.Scanner;

public class ArrayBloodTypes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String[] bloodType = { "A+", "O-", "AB+", "O+", "AB+", "AB+", "O-", "AB+", "O+", "AB+" };

		System.out.print("Enter blood type: ");
		String blood = input.nextLine();

		int counter = 0;
		for (int i = 0; i < bloodType.length; i++) {

			if (blood.equals(bloodType[i])) {
				counter++;
			}

		}

		int percentage = 100 / bloodType.length * counter;
		System.out.println(percentage + ",0 %");

		input.close();

	}

}