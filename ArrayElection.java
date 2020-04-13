
import java.util.Scanner;

public class ArrayElection {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of candidates: ");
		int number = Integer.parseInt(input.nextLine());

		String[] candidate = new String[number];
		int[] votes = new int[number];

		for (int i = 0; i < candidate.length; i++) {
			System.out.print("Enter " + (i + 1) + ". name: ");
			candidate[i] = input.nextLine();
			System.out.print("Enter votes: ");
			votes[i] = Integer.parseInt(input.nextLine());
		}

		int max = votes[0];
		int counter = 0;
		int order = 0;
		String outputText = "The election is a tie between the following candidates:";

		for (int j = 0; j < votes.length; j++) {
			if (votes[j] > max) {
				max = votes[j];
				order = j;
			} else if (votes[j] == max) {
				counter++;
			}
		}

		if (counter > 1) {
			for (int j = 0; j < votes.length; j++) {
				if (votes[j] == max)
					outputText += "\n" + candidate[j] + " (" + votes[j] + " votes)";
			}
		} else {
			outputText = "The winner is " + candidate[order] + " with " + votes[order] + " votes!";
		}

		System.out.println(outputText);
		input.close();
	}
}
