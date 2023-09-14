package mm;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class test {

	public static void main(String[] args) {

		String input = "AAABBBAABB";

		char c = input.charAt(0);
		int count = 1;
		for (int i = 1; i < input.length(); i++) {
			char c2 = input.charAt(i);

			if (c == c2) {
				count++;

			} else {
				System.out.println("Character: " + c + ", Count: " + count);
				c = c2;
				count = 1;
			}
		}

		System.out.println("Character: " + c + ", Count: " + count);

		System.out.println(input.chars().mapToObj(i -> (char) i).collect(Collectors.groupingBy(i -> i)).values()
				.stream().map(List::size).collect(Collectors.toList()));

		Map<Object, List<Character>> charcter = input.chars().mapToObj(i -> (char) i)
				.collect(Collectors.groupingBy(i -> i));

		for (Entry<Object, List<Character>> string : charcter.entrySet()) {

			System.out.println(string.getKey() + "---" + string.getValue().size());
		}

	}

}
