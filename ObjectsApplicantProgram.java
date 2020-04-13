
import java.util.Scanner;

public class ObjectsApplicantProgram {

	public static void main(String[] args) {
		Applicant[] applicantArray = new Applicant[4];

		Scanner input = new Scanner(System.in);

		for (int i = 0; i < applicantArray.length; i++) {
			System.out.print("Enter " + (i + 1) + ". name: ");
			String nameTemp = input.nextLine();
			System.out.println("Enter points: ");
			int pointsTemp = Integer.parseInt(input.nextLine());
			applicantArray[i] = new Applicant(nameTemp, pointsTemp);
		}

		System.out.println("Enter the minimum of required points: ");
		int reqPoints = Integer.parseInt(input.nextLine());

		System.out.println("The following applicants achived the minimum of " + reqPoints + " points: ");

		for (int i = 0; i < applicantArray.length; i++) {
			if (applicantArray[i].getPoints() >= reqPoints) {
				System.out.println(applicantArray[i].getName() + ", " + applicantArray[i].getPoints() + " points");
			}
		}
		input.close();
	}

}
