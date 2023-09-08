package code;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MapSortingExample {
    public static void main(String[] args) {
        // Sample map
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("banana", 3);
        myMap.put("apple", 1);
        myMap.put("cherry", 2);
        myMap.put("date", 4);
        myMap.put("date", 4);

        Set<Map.Entry<String, Integer>> s = myMap.entrySet().stream().collect(Collectors.toSet());
        
        Iterator<Map.Entry<String, Integer>> itr = s.iterator();
        while(itr.hasNext())
		{
			Map.Entry<String, Integer> data = itr.next();
			System.out.println("[ "+data.getKey()+" -- "+data.getValue()+" ]");
		}
        // Convert the map to a list of Map.Entry objects
       // List<Map.Entry<String, Integer>> entryList = new ArrayList<>(myMap.entrySet());

        // Sort the list based on keys
        
//        Collections.sort(entryList,new Comparator<Map.Entry<String, Integer>>() {
//
//			
//			@Override
//			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
//				
//				return o1.getValue().compareTo(o2.getValue());
//			}
//		});
        
//        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
//            public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
//                return entry1.getKey().compareTo(entry2.getKey());
//            }
//        });

        // Create a new LinkedHashMap to maintain the sorted order
//        Map<String, Integer> sortedMap = new LinkedHashMap<>();
//        for (Map.Entry<String, Integer> entry : entryList) {
//            sortedMap.put(entry.getKey(), entry.getValue());
//        }
//
//        // Print the sorted map
//        System.out.println(sortedMap);
   }
}

