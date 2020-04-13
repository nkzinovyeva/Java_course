
import java.util.Arrays;
import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String inputString = input.nextLine();

		if (isPalindrome(inputString) == true) {
			System.out.println("The text is a palindrome.");
		} else {
			System.out.println("No palindrome");
		}
		input.close();
	}

	public static boolean isPalindrome(String inputString) {
		if (inputString.matches("[a-zåäöA-ZÅÄÖ\\s,.:;!?\'\"-]{1,}") == false) {
			return false;
		}
		char[] charArray = inputString.toLowerCase().replaceAll("[^a-zåäöA-ZÅÄÖ]+", "").toCharArray();

		if (charArray.length < 1) {
			return false;
		}

		char[] reverseArray = new char[charArray.length];

		int j = charArray.length;

		for (int i = 0; i < charArray.length; i++) {
			reverseArray[j - 1] = charArray[i];
			j--;
		}

		if (Arrays.equals(charArray, reverseArray)) {
			return true;
		} else {
			return false;
		}
	}
}