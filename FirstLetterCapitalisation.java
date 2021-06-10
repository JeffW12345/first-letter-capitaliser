// Captalises the first letter of every word of the sentence entered by the user.

import java.util.Scanner;

public class FirstLetterCapitalisation {

	private static void capitalise(String sentenceToCapitalise) {
		System.out.println("Sentence before : " + sentenceToCapitalise);
		String[] separated = sentenceToCapitalise.split(" ");
		String finalSentence = "";

		for (String word : separated) {
			/* The 'if' condition below is because, if there is more than 1 space between two words, the second to nth spaces are rendered into 
			 * array entries of length zero by the split method
			 */
			if (word.length() == 0) {
				finalSentence += " ";  
				continue;
			}
			String firstLetterCapitalised = word.substring(0, 1).toUpperCase();
			String remainingLetters = word.substring(1, word.length());
			finalSentence += firstLetterCapitalised + remainingLetters + " ";
		}

		System.out.println("Sentence after : " + finalSentence);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("FIRST WORD CAPITALISER");
		System.out.println("----------------------");
		System.out.println("\nCapitalises the first letter of every word of your sentence.\n");
		System.out.println("Enter a sentence: ");
		String sentenceToCapitalise = scanner.nextLine();
		capitalise(sentenceToCapitalise);
		scanner.close();
	}
}
