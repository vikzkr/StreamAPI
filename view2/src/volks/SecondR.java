package volks;

import java.util.Arrays;

public class SecondR {

	public static void main(String[] args) {
		String input = "abdc@nbd@ie";

		String[] s = input.split("@");
		StringBuffer value = new StringBuffer();
		for (int i = 0; i < s.length; i++) {

			value.append(sort(s[i]));
			if (i < s.length - 1) {
				value.append("@");
			}

		}

		System.out.println(value.toString());

	}

	private static StringBuffer sort(String string) {
		char[] ch = string.toCharArray();

		Arrays.sort(ch);
		StringBuffer sb = new StringBuffer();
		for (char c : ch) {
			sb.append(c);
		}

		return sb;
	}

}
