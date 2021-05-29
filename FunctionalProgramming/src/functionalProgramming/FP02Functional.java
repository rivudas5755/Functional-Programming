package functionalProgramming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FP02Functional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = Arrays.asList(1, 21, 34, 45, 12, 31, 141, 445, 12, 41, 14, 4,4,12,21, 12);
		List<String> courses = Arrays.asList("Spring", "Spring Boot", "Spring MicroServices","Spring", "SQL", "MySQL",
				"MANGODB");

		System.out.println("\n\nDistinct Element ");
		printDistinctElement(numbers);
		
		System.out.println("\n\nSorted Numbers ");
		printSortNumbers(numbers);
		
		System.out.println("\n\nSorted String ");
		printSortString(courses);
		
		System.out.println("\n\nSorted Natural String ");
		printSortNaturalString(courses);
		
		System.out.println("\n\nSorted Custom String ");
		printSortCustomString(courses);

	}

	private static void printSortCustomString(List<String> courses) {

		courses.stream()
		.sorted(Comparator.comparing(str->str.length()))
		//.sorted(Comparator.reverseOrder())
		.distinct()
		.forEach(System.out::println);
		
	}

	private static void printSortNaturalString(List<String> courses) {
		
		courses.stream()
		.sorted(Comparator.reverseOrder())
		//.distinct()
		.forEach(System.out::println);
		
	}

	private static void printSortString(List<String> courses) {
		
		courses.stream()
		.sorted()
		//.distinct()
		.forEach(System.out::println);
	}

	private static void printSortNumbers(List<Integer> numbers) {
		
		numbers.stream()
		.sorted()
		//.distinct()
		.forEach(System.out::println);
	}

	private static void printDistinctElement(List<Integer> numbers) {
		
		numbers.stream()
		.distinct()
		.forEach(System.out::println);
		
	}

	
}
