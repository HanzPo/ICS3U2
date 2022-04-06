import java.util.*;

public class WorkingWithStrings {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input:");
		String userInput = input.nextLine();
		
		input.close();
		
		System.out.println("Output:");
		System.out.println("======================");
		System.out.println(userInput);
		
		System.out.println(userInput.toUpperCase());
		System.out.println(userInput.toLowerCase());
		System.out.println(countWords(userInput));
		System.out.println(alternateCase(userInput));
		System.out.println(countVowels(userInput));
		System.out.println(vowelToUpper(userInput));
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
}
