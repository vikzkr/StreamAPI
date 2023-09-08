package code;

import java.util.*;
import java.util.stream.Collectors;

public class SortAndCollectMap {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 35),
                new Person("David", 25)
        );

        // Sort the list of people by age using your specific logic
        Map<String, Integer> data = people.stream()
                .sorted(new Comparator<Person>() {

					@Override
					public int compare(Person o1, Person o2) {
						
						return o1.getName().compareTo(o2.getName());
					}
                	
                }
				)
                .collect(Collectors.toMap(Person::getName, Person::getAge));

        // Print the resulting map
        data.forEach((name, age) -> System.out.println("Name: " + name + ", Age: " + age));


        // Print the resulting map
       
    }
}




