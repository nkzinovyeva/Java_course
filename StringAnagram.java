
import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first string: ");
		String firstString = input.nextLine();

		System.out.print("Enter second string: ");
		String secondString = input.nextLine();

		if (isAnagram(firstString, secondString) == true) {
			System.out.println("Anagram!");
		} else {
			System.out.println("No anagram.");
		}
		input.close();
	}

	public static boolean isAnagram(String firstString, String secondString) {
		if (firstString.matches("[a-zåäöA-ZÅÄÖ\\s\\.\\,]+") == false || secondString.matches("[a-zåäöA-ZÅÄÖ\\s\\.\\,]+") == false) {
			return false;
		}
		if (firstString.matches("[^a-zåäöA-ZÅÄÖ]") == true || secondString.matches("[^a-zåäöA-ZÅÄÖ]") == true) {
			return false;
		}

		char[] charArrayFirst = firstString.toLowerCase().replaceAll("[^a-zåäöA-ZÅÄÖ]+", "").toCharArray();
		char[] charArraySecond = secondString.toLowerCase().replaceAll("[^a-zåäöA-ZÅÄÖ]+", "").toCharArray();

		Arrays.sort(charArrayFirst);
		Arrays.sort(charArraySecond);

		if (Arrays.equals(charArrayFirst, charArraySecond)) {
			return true;
		}

		else {
			return false;
		}
	}
}