// Captalises the first letter of every word of the sentence entered by the user.

import java.util.Scanner;

public class FirstLetterCapitalisation {

	private static void capitalise(String sentenceToCapitalise) {
		// Create array of words.
		System.out.println("Sentence before : " + sentenceToCapitalise);
		String[] separated = sentenceToCapitalise.split(" ");
		int numberOfWords = separated.length;
		String[] transformedWords = new String[numberOfWords]; // Array of capitalised words.
		/*
		 * Loops through the words. Creates two strings - one containing the first
		 * letter (capitalised) and one containing the remaining letters. Then combines
		 * them and puts the new string consisting of the capitalised word into the
		 * transformedWords array.
		 */
		int count = 0;
		for (String word : separated) {
			String firstLetterCapitalised = word.substring(0, 1).toUpperCase();
			String remainingLetters = word.substring(1, word.length());
			transformedWords[count] = firstLetterCapitalised + remainingLetters;
			count++;
		}
		// Reconstructs the sentence with purely capitalised words.
		String finalSentence = "";
		for (String word : transformedWords) {
			finalSentence += word + " ";
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
