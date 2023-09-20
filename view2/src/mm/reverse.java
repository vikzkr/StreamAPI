package mm;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class reverse {

	public static void main(String[] args) {

		String input = "vikas mishra";
//		char[] ch = r.toCharArray();
//		StringBuilder sb = new StringBuilder();
//		for (int i = ch.length - 1; i >= 0; i--) {
//			sb.append(ch[i]);
//
//		}
//		System.out.println(sb.toString());
//		new StringBuilder(r).reverse().toString();
//		
//		StringBuilder sbc = new StringBuilder(r);
//		Arrays.stream(r.split("\\s+")).map(i -> reverse(i)).forEach(System.out::print);
//		
		
		
		  System.out.println(  
				  IntStream.range(0, input.length())
		            .mapToObj(i -> input.charAt(input.length() - i -1 ))
		            .map(Object::toString)
		            .collect(Collectors.joining())
		            );
		
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
