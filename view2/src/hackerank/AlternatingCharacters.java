package hackerank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;



public class AlternatingCharacters {
	
	public static void main(String[] args) {
		 String originalString = "aaabbb";
		 
		 int output = alternatingCharacters(originalString);
		 System.out.println(output);
		
	}

	private static int alternatingCharacters(String originalString) {
		
		char ch = originalString.charAt(0);
		StringBuffer sb = new StringBuffer();
		sb.append(ch);
		
		for (int i = 1; i < originalString.length(); i++) {
			
			char ch2 = originalString.charAt(i);
			
			if(ch != ch2)
			{
				sb.append(ch2);
				ch = ch2;
			}
			
		}
		
		return originalString.length()-sb.length();
	}
	
	 
}
