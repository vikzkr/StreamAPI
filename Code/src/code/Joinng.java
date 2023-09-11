package code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Joinng {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Alice", 30), new Person("Alice", 3), new Person("Bob", 25),
				new Person("Charlie", 35), new Person("David", 25), new Person("Bre", 25), new Person("kandy", 504),
				new Person("mark", 500));

		String data = people.stream().filter((person) -> person.getAge() > 20).map(Person::getName)
				.map(String::toUpperCase).collect(Collectors.joining(","));
		System.out.println(data);
		System.out.println("------1------");
		System.out.println(
				people.stream().collect
				(Collectors.groupingBy((person) -> person.getAge())));
		System.out.println("-----2------");
		System.out.println(people.stream().collect(
				Collectors.groupingBy(Person::getName, Collectors.mapping(Person::getAge, Collectors.toList()))));

		System.out.println("------3------");
		System.out.println(
				people.stream().collect(Collectors.groupingBy((person) -> person.getName(), Collectors.toList())));
		System.out.println("------4------");
		System.out.println(people.stream().collect(Collectors.partitioningBy((person) -> person.getAge() > 25)));
		
		System.out.println("-----5-------");
		System.out.println(people.stream().collect(Collectors.groupingBy(Person::getName, Collectors
				.mapping(Person::getAge, Collectors.collectingAndThen(Collectors.counting(), Long::intValue)))));
		System.out.println("-------6-----");

		// importing
		System.out.println(people.stream()
				.collect(Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Person::getAge)),
						person -> person.map(Person::getName).orElse(""))));
		System.out.println(people.stream().collect(Collectors.minBy(Comparator.comparing(Person::getAge))));

		// filtering
		System.out.println("----7--------");
		System.out.println(people.stream().collect(Collectors.groupingBy(Person::getName,
				Collectors.mapping(Person::getAge, Collectors.filtering(age -> age > 50, Collectors.toList())))));
//		Map <String , List<Person>> str = new HashMap<>();
//		
//		for(Person pe : peoplemere)
//		{
//			List<Person> list = null;
//			if(str.containsKey(pe.getName()))
//			{
//				list = str.get(pe.getName());
//			}
//			else
//			{
//				list = new ArrayList<Person>();
//				str.put(pe.getName(), list);
//			}
//			list.add(pe);
//		}
//		System.out.println(str);
//		
	}

}
