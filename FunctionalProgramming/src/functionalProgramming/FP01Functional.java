package functionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FP01Functional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = Arrays.asList(1, 21, 34, 45, 12, 31, 141, 445, 12, 41, 14, 4, 12);
		List<String> courses = Arrays.asList("Spring", "Spring Boot", "Spring MicroServices", "SQL", "MySQL",
				"MANGODB");

		System.out.println("All Numbers");
		printAllNumbersInListFunctional(numbers);
		
		System.out.println("Sum of All Numbers");
		System.out.println(sumOfAllNumberInList(numbers));

		System.out.println("\n\nAll Even Numbers");
		printAllEvenNumbersInListFunctional(numbers);
		
		System.out.println("\n\nSquares of All Even Numbers");
		printAllSquaresOfEvenNumbersInListFunctional(numbers);

		System.out.println("\n\nPrint All Words");
		printAllCourses(courses);
		
		System.out.println("\n\nPrint All Spring Words");
		printAllSpringCourses(courses);
		
		System.out.println("\n\nPrint All Courses With More Than 7 Characters");
		printAllMoreThanFourLettersCourses(courses);
		
		System.out.println("\n\nPrint No. Of Characters in Each Course");
		printCharactersInEachCourses(courses);

	}


	private static void printAllSquaresOfEvenNumbersInListFunctional(List<Integer> numbers) {
		// TODO Auto-generated method stub
		
		numbers.stream()
		.filter(number->number%2==0)
		.map(number->number*number)
		.forEach(System.out::println);
		
	}

	public static boolean isEven(int number) {
		return number % 2 == 0;
	}
	
	public static int sum(int a, int b) {
		return a+b;
	}
	
	private static int sumOfAllNumberInList(List<Integer> numbers) {
		// TODO Auto-generated method stub
		
		return numbers.stream()
		.reduce(0, FP01Functional::sum);
		
		
	}

	// Print All number in list
	private static void printAllNumbersInListFunctional(List<Integer> numbers) {

		numbers.stream().forEach(System.out::println);

	}

	// Print All Even number in list
	private static void printAllEvenNumbersInListFunctional(List<Integer> numbers) {

		numbers.stream()
				// .filter(FP01Functional::isEven)
				.filter(number -> number % 2 == 0).forEach(System.out::println);

	}

	private static void printAllCourses(List<String> courses) {
		// TODO Auto-generated method stub

		courses.stream()
		.forEach(System.out::println);
	}
	
	private static void printAllSpringCourses(List<String> courses) {
		// TODO Auto-generated method stub

		courses.stream()
		.filter(course->course.contains("Spring"))
		.forEach(System.out::println);
	}
	
	private static void printAllMoreThanFourLettersCourses(List<String> courses) {
		// TODO Auto-generated method stub

		Predicate<String> courseLengthGreaterThan7Predicate = course->course.length()>7;
		
		courses.stream()
		.filter(courseLengthGreaterThan7Predicate)
		.forEach(System.out::println);
	}
	
	private static void printCharactersInEachCourses(List<String> courses) {
		// TODO Auto-generated method stub
		
		courses.stream()
		//.filter(course->course.length()>7)
		.map(course->course.length())
		.forEach(System.out::println);
		
	}

}
