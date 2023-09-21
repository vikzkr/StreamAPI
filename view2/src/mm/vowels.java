package mm;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class vowels {

	public static void main(String[] args) {

		String mainString = "VIKAS";
		Map<Boolean, List<Character>> result = mainString.chars().mapToObj(i -> (char) i)
				.collect(Collectors.partitioningBy(i -> i == 'A' || i == '0' || i == 'E' || i == 'I' || i == 'U'));
		System.out.println(result.get(true));
		System.out.println(result.get(false));

		char[] ch = mainString.toCharArray();
		for (char i : ch) {

			if (i == 'A' || i == '0' || i == 'E' || i == 'I' || i == 'U') {
				System.out.print("VOWELS ARE " + i + " ,");
			} else {
				System.out.print("CONSONENT ARE " + i + " ,");
			}

		}
		
		 String vowels = Arrays.stream(mainString.split(""))
		            .filter(s -> "aeiou".contains(s))
		            .collect(Collectors.joining(", "));

	}
}