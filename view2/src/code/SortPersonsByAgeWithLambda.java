package code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return name + " " ;
	}

//	@Override
//	public int compareTo(Person o) {
//		 return Integer.compare(this.age, o.getAge());
//		//return 0;
//	}
}

public class SortPersonsByAgeWithLambda {
	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		people.add(new Person("Alice", 30));
		people.add(new Person("Bob", 25));
		people.add(new Person("Charlie", 35));
		people.add(new Person("Vikas", 5));

		
		
		 Collections.sort(people,Comparator.comparing(Person::getName));
			for (Person person : people) {
			System.out.println(person);
		}

		
//		Map <String, Integer> person = people.stream().collect(Collectors.toMap(i->i.getName(), j->j.getAge()));
//		Iterator<Map.Entry<String, Integer>> itr = person.entrySet().iterator();
//		while(itr.hasNext())
//		{
//			Map.Entry<String, Integer> data = itr.next();
//			System.out.println("[ "+data.getKey()+" -- "+data.getValue()+" ]");
//		}
		//person.entrySet().stream().collect(Collectors.groupingBy((people) -> people.getKey()));
//		Map <String, Integer> sorting = new LinkedHashMap<String, Integer>();
//		for (Map.Entry<String, Integer> entry : person.entrySet()) {
//			sorting.put(entry.getKey(), entry.getValue());
//        }
	
		// Sort the list of people by age using a lambda expression
		// Collections.sort(people, (person1, person2) ->
		// Integer.compare(person1.getAge(), person2.getAge()));
		
		
		//TOMAp
		//sorted((i, j) -> i > j ? 1 : j > i ? -1 : 0
//		 .sorted((i, j) -> i.getAge() > j.getAge() ? 1 : i.getAge() < j.getAge() ? -1 : 0)
//		 .sorted((i, j) ->  i.getAge() > j.getAge() ? 1 : i.getAge() < j.getAge() ? -1 : 0)
//		 .sorted((i, j)  -> i.getAge() > j.getAge() ? 1 : i.getAge() < j.getAge() ? -1 : 0)
//		Map<String ,Integer>  data  = people.stream()
//				.sorted(Comparator.comparing(Person::getAge, (age1, age2) -> {
//                    if (age1 < age2) return -1;
//                    if (age1 > age2) return 1;
//                    return 0;
//                }))
//				.collect(Collectors.toMap(i-> i.getName(), j->j.getAge()));

		//data.forEach((name, age) -> System.out.println("Name: " + name + ", Age: " + age));
//		Iterator<Map.Entry<String, Integer>> iterator = data.entrySet().iterator();
//		Iterator<Map.Entry<String, Integer>> iterator2 = data.entrySet().iterator();
//		while(iterator.hasNext())
//		{
//			Map.Entry<String, Integer> result = iterator.next();
//			System.out.println(result.getKey()+" --- "+result.getValue());
//			
//		}
		// Print the sorted list
//		for (Person person : people) {
//			System.out.println(person);
//		}
	}
}
