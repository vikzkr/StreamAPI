package code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Code {

	public static void main(String[] args) {
		
		IntStream intStream = IntStream.of(1, 2, 3, 4, 5);
		IntSummaryStatistics stats = intStream.summaryStatistics();

		System.out.println("Sum: " + stats.getSum());
		System.out.println("Average: " + stats.getAverage());
		System.out.println("Max: " + stats.getMax());
		System.out.println("Min: " + stats.getMin());
		System.out.println("Count: " + stats.getCount());

//		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//		List<Integer> randomList = generateRandomList(10, 1, 100); // Generates a random list of 10 integers between 1
//																	// and 100
//		// 1
//		Integer num = numbers.stream().min((i, j) -> i > j ? 1 : j > i ? -1 : 0).orElseThrow();
//		// System.out.println(num);
//
//		// 2
//		
//		for (int x : randomList) {
//			System.out.print(x + " ");
//		}
//
//		System.out.println("");
//		//a
////		List<Integer> numbers2 = randomList.stream().sorted((i, j) -> i > j ? 1 : j > i ? -1 : 0)
////				.collect(Collectors.toList());
//		List<Integer> numbers2 = randomList.stream().sorted((i,j)-> j.compareTo(i))
//				.collect(Collectors.toList());
//		System.out.print(numbers2);
	}

	public static List<Integer> generateRandomList(int size, int min, int max) {
		List<Integer> randomList = new ArrayList<>();
		Random rand = new Random();

		for (int i = 0; i < size; i++) {
			randomList.add(rand.nextInt(max - min + 1) + min);
		}

		return randomList;
	}

}
