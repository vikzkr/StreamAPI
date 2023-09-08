package code;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class setExample {
	public static void main(String[] args) {
		
		 Set<String> stringSet = new HashSet<>();

	        // Add elements to the Set
	        stringSet.add("Apple");
	        stringSet.add("Banana");
	        stringSet.add("Cherry");
	        
	        System.out.println("---------------");
	        boolean r = stringSet.stream().anyMatch(s->s.startsWith("A"));
	        System.out.println(r);
	        System.out.println("---------------");
	        stringSet.stream().findFirst();
	       
	}

}
