package volks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class volks {

	public static void main(String[] args) {
		

		// 1.
		String today = "Today is Saturday redSaturday";
		String[] arr = today.split(" ");
		String temp = "";

		for (String item : arr) {
			System.out.println(item);

			if (temp.length() < item.length()) {
				temp = item;
			}
		}
		System.out.println(temp);

		Optional<String> name = Arrays.stream(arr)
				.max((w1, w2) -> w1.length() > w2.length() ? 1 : w1.length() < w2.length() ? -1 : 0);
		System.out.println(name.get());

		String s = "Vikas Mishra";
		char[] ch = s.toCharArray();
		Set<Character> sch = new LinkedHashSet<Character>();
		for (char c : ch) {

			sch.add(c);
		}

		StringBuilder sb = new StringBuilder();
		for (char c : sch) {

			sb.append(c);
		}

		System.out.println("sb " + sb.toString());
		sch.forEach(System.out::print);
		System.out.println();
		s.chars().distinct().mapToObj(i -> (char) i).forEach(System.out::print);
	}

}
