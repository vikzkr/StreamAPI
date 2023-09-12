package mm;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class vowels {
	
	public static void main(String[] args) {
		
		String mainString = "VIKAS";
		 Map<Boolean, List<Character>> partitionedMap =	mainString.chars().mapToObj(i -> (char) i).
		collect(Collectors.partitioningBy(i-> i == 'A' || i=='E'|| i == 'I' || i=='O'|| i=='U'));
		 List<Character> vowels = partitionedMap.get(true);
		 List<Character> consonent = partitionedMap.get(false);
		System.out.println("vowels are "+ vowels);
		System.out.println("consonent are "+ consonent);
	}
}