package volks;

import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		String mainString = "Today is Saturday is Today";
		// System.out.println(mainString.chars().distinct().mapToObj(obj->String.valueOf((char)obj)).collect(Collectors.joining()));
		String substring = "Today";
		int frequency = findSubstringFrequency(mainString, substring);
		// mainString.chars().mapToObj(obj -> (char)(obj)).forEach(character ->
		// System.out.print(character));

		String[] mainString2 = mainString.split("\\s+");
		for (String string : mainString2) {

			System.out.println(string);
		}
		Stream<String> wordStream = Stream.of(mainString2);
		long frequency2 = wordStream
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
