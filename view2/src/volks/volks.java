package volks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class volks {

	public static void main(String[] args) {

//      1.
		String today = "Today is Saturday";
		String[] arr = today.split(" ");
		String temp = "";
		for (String item : arr) {
			System.out.println(item);

			if (temp.length() < item.length()) {
				temp = item;
			}
		}
		System.out.println(temp);

		String sentence = "Today is Saturday";

		String[] words = sentence.split(" ");

// 		Use a Stream and reduce to find the last word
//	    String lastWord = Arrays.stream(words)
//	        .reduce((first, second) -> second) // Keep the second word as we iterate
//	         .orElse(null); // Handle the case when the sentence is empty

		String largestWord = Arrays.stream(words)
				.max((word1, word2) -> word1.length() > word2.length() ? 1 : word1.length() < word2.length() ? -1 : 0)
				.orElse(null); // Handle the case when the sentence is empty
		// max((word1, word2) -> Integer.compare(word1.length(), word2.length()))
		// System.out.println("The largest word is: " + largestWord);

		// 2
		System.out.println("---------------------");
		String s2 = "Vikas Mishra";
		char[] charArray = s2.toCharArray();
		Set<Character> uniqueCharacters = new LinkedHashSet<Character>();
		for (char c : charArray) {
			uniqueCharacters.add(c);
		}
		StringBuilder result = new StringBuilder();
		for (Character character : uniqueCharacters) {
			result.append(character);
		}
		String stringWithoutDuplicates = result.toString();

		// Print the string without duplicates
		System.out.println("String without duplicates: " + stringWithoutDuplicates);

		String s = "Vikas Mishra";
		String stringWithouDuplicates = s.chars() // Convert the string to an IntStream of characters
//	  	          .peek(st -> System.out.println("Filtered 1 value:" + st))
				.distinct() // Remove duplicates by getting distinct characters
//	  			 .peek(st -> System.out.println("Filtered 1 value:" + st))
				.mapToObj(ch -> String.valueOf((char) ch)).peek(st -> System.out.println("Filtered 1 value:" + st)) // Convert
																													// each
																													// character
																													// back
																													// to
																													// a
																													// string
				.collect(Collectors.joining()); // Join the characters into a single string

	}

}
