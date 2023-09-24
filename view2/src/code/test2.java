package code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringJoiner;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class test2 {
	
	public static void main(String[] args) {
		
		
		String input = "aabbcccdddbb";
		 String op = "c3d3a2b2";
		 
//	Map<String ,Long> map =	 Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new ,Collectors.counting()));	
//	
//	List<Entry<String , Long>> list = new ArrayList<Entry<String,Long>>(map.entrySet());
//	
//	Collections.sort(list,Collections.reverseOrder(Comparator.comparing(Entry::getValue)));
//	
//	for (Entry<String, Long> entry : list) {
//		
//		System.out.print(entry.getKey()+""+entry.getValue());
//		
//	}
		 
		Map s = new Hashtable();
		s.put(null, null);
		System.out.println(s);
	
		
//		
//		//Q3 How to find duplicate elements in a given integers list in java using Stream functions?
//		 List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,25,32);
//
//	
//		 System.out.println( myList.stream().
//				 collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
//				 .entrySet()
//				 .stream()
//				 .filter(entry ->entry.getValue()>1).map(entry ->entry.getKey())
//				 .collect(Collectors.toList()));
//		 
//		 
//		 LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
//           myList.stream()
//                 .filter(n -> !set.add(n))
//                 .forEach(System.out::println);
//           
//           System.out.println(set);
//           
////           
//           int max =  myList.stream()
//                   .max(Integer::compare)
//                   .get();
//           List<Integer> duplicates = myList.stream()
//                   .collect(Collectors.toCollection(() -> new LinkedHashSet<>()))
//                   .stream()
//                   .filter(i -> Collections.frequency(myList, i) > 1)
//                   .collect(Collectors.toList());
////           
////          
////         //Q7 Given a String, find the first non-repeated character in it using Stream functions?
//   		String input2 = "Java Hungry Blog Alive is Awesome";
//   		System.out.println(input.chars().mapToObj(i-> (char)i).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
//   				.entrySet()
//   				.stream()
//   				.filter(entry -> entry.getValue()==1).
//   				map(entry -> entry.getKey()).findFirst().get());
//   		
////   		
//   		//Q10 Given a list of integers, sort all the values present in it in descending order using Stream functions?
//   	 myList.stream()
//     .sorted(Collections.reverseOrder())
//     .forEach(System.out::println);
//////   	 
//   	myList.stream()
//    .sorted()
//    .forEach(System.out::println);
		
		
		 List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

	        // Sort the list based on the second character
	        List<String> sortedList = words.stream()
	            .sorted(Comparator.comparing(str -> str.length() > 1 ? str.charAt(1) : '\0'))
	            .collect(Collectors.toList());

	        System.out.println(sortedList);

	}
	//StringJoiner joiner = new StringJoiner(", ", "[", "]");

	
	
}
