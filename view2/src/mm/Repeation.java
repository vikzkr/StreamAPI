package mm;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Repeation {
    public static void main(String[] args) {

//        int[] arr = {1,1,2,1,4,3,2,4,2,3,5,3,2,5,4,3};
//        
//        Map<Integer, Long> occurrences =     Arrays.stream(arr).mapToObj(i->Integer.valueOf(i)).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//     
//        for (Entry<Integer, Long> c : occurrences.entrySet()) {
//        	System.out.println(c.getKey()+"---"+c.getValue());
//        	
//			
//		}
    	
    	String input = "occurrence";

    	char[] arr = input.toCharArray();

    	Map<Character , Integer> obj = new HashMap<>();
    	int count = 0;
    	for(char ch : arr)
    	{
    	if(obj.containsKey(ch))
    	{
    		int c = obj.get(ch);
    		
    		obj.put(ch,c+1);	
    		
    	}
    	else
    	{
    		obj.put(ch,1);	
    	}
    	}
    	
        
    	for (Entry<Character , Integer> c : obj.entrySet()) {
        	System.out.println(c.getKey()+"---"+c.getValue());
        	
		
	}
        
    }
}
