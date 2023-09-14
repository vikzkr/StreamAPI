package mm;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class reverse {

	public static void main(String[] args) {

		String r = "vikas mishra";
		char[] ch = r.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = ch.length - 1; i >= 0; i--) {
			sb.append(ch[i]);

		}
		System.out.println(sb.toString());
		new StringBuilder(r).reverse().toString();
		
		StringBuilder sbc = new StringBuilder(r);
		Arrays.stream(r.split("\\s+")).map(i -> reverse(i)).forEach(System.out::print);
		
		
		 String reversedString = new StringBuilder(
		            Stream.of(ch)
		                .map(String::valueOf)
		                .collect(Collectors.toList())
		                .stream()
		                .reduce((s1, s2) -> s2 + s1)
		                .orElse("")
		        ).toString();
		
	}

	
	private static Object reverse(String r) {
		StringBuilder sb = new StringBuilder();
		char[] ch = r.toCharArray();
		for (int i = r.length() - 1; i >= 0; i--) {
			sb.append(ch[i]);

		}
		//System.out.println(r);
		return sb;
	}

}
