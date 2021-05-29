package functionalProgramming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FP04Functional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = Arrays.asList(1, 21, 34, 45, 12, 31, 141, 445, 12, 41, 14, 4,4,12,21, 12);
		List<String> courses = Arrays.asList("Spring", "Spring Boot", "Spring MicroServices","Spring", "SQL", "MySQL",
				"MANGODB");
		
		List<Integer> doubledNumbers = doubleNumber(numbers);
		System.out.println("Doubled Numbers: "+doubledNumbers);
		
		List<Integer> courseLength = courseLength(courses);
		System.out.println("Course Length: "+courseLength);
		
		
		
	}

	private static List<Integer> courseLength(List<String> courses) {
		// TODO Auto-generated method stub
		return courses.stream()
				.map(course->course.length())
				.collect(Collectors.toList());
	}

	private static List<Integer> doubleNumber(List<Integer> numbers) {
		
		return 
				numbers.stream()
				.map(number-> number*2)
				.collect(Collectors.toList());
	}

	
}
