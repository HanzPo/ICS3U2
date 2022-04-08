// Imports
import java.util.*;

public class WorkingWithStrings {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // Sets up scanner
		String[] searchWords = new String[] { "be", "the" }; // Creates array of words to check for from the user's input
		
		welcome(); // Calls welcome method which prints ascii art
		
		
		System.out.println("Please enter a word with an even number of letters, or a phrase (up to 6 words):"); // Asks user for input
		String userInput = input.nextLine().trim().replaceAll("\\s+", " "); // Takes user input, removes leading & trailing whitespaces, and ensures that all spaces are of a consistent length
		
		input.close();
		
		// Prints output
		System.out.println("Output:");
		System.out.println("==========================================================================");
		
		if (countWords(userInput) > 1) {
			System.out.println("     You entered: " + userInput);
			System.out.println("           Upper: " + userInput.toUpperCase());
			System.out.println("           Lower: " + userInput.toLowerCase());
			System.out.println("         # Words: " + countWords(userInput));
			System.out.println("        Alt Case: " + alternateCase(userInput));
			System.out.println("        # Vowels: " + countVowels(userInput));
			System.out.println("      Vowel Case: " + vowelToUpper(userInput));
			System.out.println("         Reverse: " + reverseString(userInput));
			System.out.println("  Be's and The's: " + countWords(userInput, searchWords));
		}
		else if (userInput.length() % 2 == 0) {
			wordStack(userInput);
		}
		else {
			System.out.println("Please enter a valid input");
		}
	}

	public static int countWords(String value) {
		int wordcount = 1;
		for (int i = 0; i < value.length(); i++) {
			if (value.charAt(i) == ' ') wordcount++;
		}
		return wordcount;
	}
	
	public static String alternateCase(String value) {
		char[] alternatedString = new char[value.length()];
		
		for (int i = 0; i < value.length(); i++) {
			if (i % 2 == 0) {
				alternatedString[i] = Character.toUpperCase(value.charAt(i));
			}
			else {
				alternatedString[i] = Character.toLowerCase(value.charAt(i));
			}
		}
		return String.valueOf(alternatedString);
	}
	
	public static boolean isVowel(char value) {
		return (value == 'a' || value == 'e' || value == 'i' || value == 'o' || value == 'u');
	}
	
	public static int countVowels(String value) {
		
		int vowelCount = 0;
		for (int i = 0; i < value.length(); i++) {
			if (isVowel(value.charAt(i)))
				vowelCount++;
		}
		
		return vowelCount;
	}
	
	public static String vowelToUpper (String value) {
		char[] valueArray = new char[value.length()];
		
		for (int i = 0; i < value.length(); i++) {
			if (isVowel(value.charAt(i)))
				valueArray[i] = Character.toUpperCase(value.charAt(i));
			else
				valueArray[i] = Character.toLowerCase(value.charAt(i));
		}
		
		return String.valueOf(valueArray);
	}
	
	public static String reverseString (String value) {
		char[] valueArray = new char[value.length()];
		
		int i = 0;
		while (i < value.length()) {
			valueArray[i] = value.charAt(value.length() - i - 1);
			i++;
		}
		
		return String.valueOf(valueArray);
	}
	
	public static int countWords(String value, String[] searchWords) {
		int wordCount = 0;
		String wordToCheck = " " + value.toLowerCase() + " ";
		
		for (int i = 0; i < searchWords.length; i++) {
			int idx = wordToCheck.indexOf((" " + searchWords[i].trim() + " ").toLowerCase());
			while (idx != -1) {
				idx = wordToCheck.indexOf((" " + searchWords[i].trim() + " ").toLowerCase(), idx + 1);
				wordCount++;
			}
		}
		
		return wordCount;
	}
	
	public static void wordStack(String word) {
		for (int i = 1; i <= (word.length() / 2); i++) {
			for (int j = 0; j < (word.length() / 2) - i; j++)
			{
				System.out.print(" ");
			}
			System.out.printf("%s%n", word.substring(((word.length() / 2) - i), ((word.length() / 2) + i)));
		}
	}
	
	public static void welcome() {
		String[] asciiArt = new String[] {  "		     ⠀⠀⠀⠀⠀⢀⣠⣤⣴⣶⣶⣶⣶⣶⠶⣶⣤⣤⣀⠀⠀⠀⠀⠀⠀",
	                                     	"		⠀⠀⠀⠀⠀⠀⠀⢀⣤⣾⣿⣿⣿⠁⠀⢀⠈⢿⢀⣀⠀⠹⣿⣿⣿⣦⣄⠀⠀⠀",
		                                    "		⠀⠀⠀⠀⠀⠀⣴⣿⣿⣿⣿⣿⠿⠀⠀⣟⡇⢘⣾⣽⠀⠀⡏⠉⠙⢛⣿⣷⡖⠀",
	                                     	"		⠀⠀⠀⠀⠀⣾⣿⣿⡿⠿⠷⠶⠤⠙⠒⠀⠒⢻⣿⣿⡷⠋⠀⠴⠞⠋⠁⢙⣿⣄",
	                                    	"		⠀⠀⠀⠀⢸⣿⣿⣯⣤⣤⣤⣤⣤⡄⠀⠀⠀⠀⠉⢹⡄⠀⠀⠀⠛⠛⠋⠉⠹⡇",
	                                     	"		⠀⠀⠀⠀⢸⣿⣿⠀⠀⠀⣀⣠⣤⣤⣤⣤⣤⣤⣤⣼⣇⣀⣀⣀⣛⣛⣒⣲⢾⡷",
	                                    	"		⢀⠤⠒⠒⢼⣿⣿⠶⠞⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠁⠀⣼⠃",
	                                    	"		⢮⠀⠀⠀⠀⣿⣿⣆⠀⠀⠻⣿⡿⠛⠉⠉⠁⠀⠉⠉⠛⠿⣿⣿⠟⠁⠀⣼⠃⠀",
	                                    	"		⠈⠓⠶⣶⣾⣿⣿⣿⣧⡀⠀⠈⠒⢤⣀⣀⡀⠀⠀⣀⣀⡠⠚⠁⠀⢀⡼⠃⠀⠀",
											"		⠀⠀⠀⠈⢿⣿⣿⣿⣿⣿⣷⣤⣤⣤⣤⣭⣭⣭⣭⣭⣥⣤⣤⣤⣴⣟⠁"};
		
		for (int i = 0; i < asciiArt.length; i++) {
			System.out.println(asciiArt[i]);
		}
		System.out.println();
		System.out.println("Welcome to Change That Message");
		System.out.println();
	}
}
