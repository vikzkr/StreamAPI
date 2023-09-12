package mm;

import java.util.Iterator;

public class test {

	public static void main(String[] args) {

		String input = "AAABBBAABB";

		// List<Integer> count =
		// Arrays.stream(countRun.split("")).collect(Collectors.groupingBy(s->s)).values().stream().map(List::size).collect(Collectors.toList());

		// Initialize variables to keep track of the current character and its count
		char currentChar = input.charAt(0);
		int currentCharCount = 1;

		// Start from the second character (index 1) and iterate through the string
		for (int i = 1; i < input.length(); i++) {
			char current = input.charAt(i);

			// If the current character is the same as the previous one, increment the count
			if (current == currentChar) {
				currentCharCount++;
			} else {
				// If it's different, print the count and the character, then reset the count
				System.out.println("Character: " + currentChar + ", Count: " + currentCharCount);

				// Update currentChar to the new character and reset the count to 1
				currentChar = current;
				currentCharCount = 1;
			}
		}
		System.out.println("Character: " + currentChar + ", Count: " + currentCharCount);

	}

}
