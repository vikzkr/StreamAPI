package volks;

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		String mainString = "Today is Saturday is Today";

		String substring = "Today";
		int frequency = findSubstringFrequency(mainString, substring);
		String[] inputString = mainString.split("\\s+");
		Arrays.stream(inputString)
		.filter(word -> Pattern.compile(substring, Pattern.CASE_INSENSITIVE).matcher(word).find()).count();
	}

	private static int findSubstringFrequency(String mainString, String substring) {

		int index = 0;
		int count = 0;

		while (index != -1) {
			index = mainString.indexOf(substring, index);
			if (index != -1) {
				count++;
				index = index + substring.length();
			}

		}
		return count;

	}

}
