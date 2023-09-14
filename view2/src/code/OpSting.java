package code;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OpSting {
	
	public static void main(String[] args) {
		
		String  name= "vikas";
		
		System.out.println("-----------");
		Stream<Character> c = name.chars().mapToObj((i)->(char)(i));
		//System.out.println(c.collect(Collectors.counting()));
		//System.out.println(c.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
		System.out.println(c.collect(Collectors.partitioningBy((a)-> a == 'v')));
		System.out.println("-----------");
		List<Integer> list = Arrays.asList(2,4,1,3,5,8,7);
		System.out.println(list.stream().
				sorted(Comparator.comparing(Integer::valueOf)).collect(Collectors.toList()));
		System.out.println("-----------");
		List<Integer> list2 = Arrays.asList(2,4,1,3,5,8,7);
		System.out.println(list.stream().
				map((x)->x.intValue()).
				sorted((i,j)-> i>j?1:i<j?-1:0).
				collect(Collectors.toList()));
		
	}

}
