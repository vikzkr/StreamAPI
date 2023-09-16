package code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;

public class test {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("aaryanna");
		al.add("aayanna");
		al.add("airianna");
		al.add("alassandra");
		al.add("annabella");
		Map<String , Integer> result = findDistinctCharcterFromList(al);
		System.out.println(result);
	}
	private static Map<String , Integer> findDistinctCharcterFromList(ArrayList<String> al) {
		ListIterator<String> list = al.listIterator();
		Map<String , Integer> hm = new HashMap<>();
		while(list.hasNext())
		{
			String text = list.next();
			Integer count = (int) text.chars().distinct().count();
			hm.put(text, count);
		}
		return hm;	
	}

}
