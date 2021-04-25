// Captalises the first letter of every word of the sentence entered by the user.

import java.util.Scanner;

public class FirstLetterCapitalisation {

	private static void capitalise(String sentenceToCapitalise) {
		System.out.println("Sentence before : " + sentenceToCapitalise);
		String[] separated = sentenceToCapitalise.split(" ");
		String finalSentence = "";

		for (String word : separated) {
			// When there is more than once space before or after a word, each space is rendered into an array entry of 0 length by split( ).
			// Code below preserves extra spaces from the original sentence in the modified sentence.
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
