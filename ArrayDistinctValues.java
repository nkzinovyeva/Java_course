

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDistinctValues {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of values: ");
		int number = Integer.parseInt(input.nextLine());
		int[] values = new int[number];

		for (int i = 0; i < values.length; i++) {
			System.out.print("Enter an integer: ");
			values[i] = Integer.parseInt(input.nextLine());
		}
		
		Arrays.sort(values);

		for (int i = 0; i < values.length; i++) {

			int j = 0;
			for (j = 0; j < i; j++) {
				if (values[i] == values[j]) {
					break;
				}
			}
			if (i == j) {
				System.out.print(values[i] + " ");
			}
		}

		input.close();

	}

}

//boolean isDistinct = false;

//for (int j = 0; j < i; j++) {
//	if (values[i] == values[j]) {
//		isDistinct = true;
//		break;
//	}
//}
//if (!isDistinct) {
//	System.out.print(values[i] + " ");
//}

