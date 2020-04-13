
import java.util.ArrayList;
import java.util.Scanner;

public class ObjectsLanguageTranslationArrayList {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ArrayList<WordPair> wordsList = new ArrayList<WordPair>();

		System.out.println("=== Creating an English-Finnish dictionary (ok ends) ===");

		String engWord = "";
		while (engWord.contentEquals("ok") == false) {
			System.out.println("Enter an English word: ");
			engWord = input.nextLine();
			if (engWord.contentEquals("ok") == false) {
				System.out.println("Enter a Finnish word: ");
				String finWord = input.nextLine();
				wordsList.add(new WordPair(engWord, finWord));
			}
		}
		System.out.println("=== English-Finnish translation service (quit ends) ===");

		while (engWord.equals("quit") == false) {
			System.out.println("Enter an English word: ");
			engWord = input.nextLine();

			if (engWord.equals("quit")) {
				break;
			} else {
				int flag = -1;
				for (int i = 0; i < wordsList.size(); i++) {
					if (wordsList.get(i).getEnglishWord().equals(engWord)) {
						System.out.println(wordsList.get(i).getFinnishWord());
						flag = 1;

					}
				}
				if (flag == -1) {
					System.out.println("Unknown word");

				}
			}
		}
		System.out.println("Bye!");
		input.close();
	}
}
