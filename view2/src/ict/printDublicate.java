package ict;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class printDublicate {
	
	public static void main(String[] args) {
		int[] arr ={10,15,8,49,25,98,98,32,15};
		
//		Set<Integer> set = new HashSet<>();
//		
//		for (Integer integer : arr) {
//			if(set.contains(integer))
//			{
//				System.out.println(integer);
//			}
//			else
//			{
//				set.add(integer);
//			}
//			
//		}

//	Map<Integer , List<Integer>> list = 	
//			Arrays.stream(arr).mapToObj(Integer::valueOf).collect(Collectors.groupingBy(i ->i));
//	System.out.println(list);
		//Arrays.stream(arr).mapToObj(Integer::valueOf).collect(Collectors.groupingBy(i ->i)).entrySet().stream();
	
		
	     List<Integer> duplicates = Arrays.stream(arr)
	                .boxed()
	                .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
	                .entrySet()
	                .stream()
	                .filter(entry -> entry.getValue() > 1)
	                .map(entry -> entry.getKey())
	                .collect(Collectors.toList());
	     
	     
	System.out.println();
	}

}
