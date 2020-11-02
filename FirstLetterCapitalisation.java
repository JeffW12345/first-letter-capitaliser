import java.util.ArrayList;

// Captalises the first letter of every word of the sentence passed to the capitalise(String sentenceToCapitalise) 
// method

public class FirstLetterCapitalisation {

	private static void capitalise(String sentenceToCapitalise) {
		// Create array of words.
		System.out.println("Sentence before : " + sentenceToCapitalise);
		String[] separated = sentenceToCapitalise.split(" ");
		int numberOfWords = separated.length;
		String[] transformedWords = new String[numberOfWords]; // Array of capitalised words.
		// Loops through the words.
		// For each word, creates an ArrayList of Characters containing first letter and
		// one containing the rest of the word.
		int count = 0;
		for (String word : separated) {
			ArrayList<Character> firstLetter = new ArrayList<>();
			firstLetter.add(word.charAt(0));
			ArrayList<Character> remainingLetters = new ArrayList<>();
			for (int i = 1; i < word.length(); i++) {
				remainingLetters.add(word.charAt(i));
			}
			// Create a string containing all letters except the first.
			String wordExceptFirstLetter = "";
			for (Character letter : remainingLetters) {
				wordExceptFirstLetter += Character.toString(letter);
			}
			// First letter converted to a string and capitalised
			String firstLetterUpperCase = Character.toString(firstLetter.get(0)).toUpperCase();
			String reassembledWord = firstLetterUpperCase + wordExceptFirstLetter; // Reassembling word
			transformedWords[count] = reassembledWord; // Puts capitalised word into array of words.
			count++;
		}
		// Reinsert spaces between words.
		String finalSentence = "";
		for (String word : transformedWords) {
			finalSentence += word + " ";
		}
		System.out.println("Sentence after : " + finalSentence);
	}

	public static void main(String[] args) {
		capitalise("this is the sentence to capitalise.");
	}

}
