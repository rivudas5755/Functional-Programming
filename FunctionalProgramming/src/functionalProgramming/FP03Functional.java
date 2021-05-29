package functionalProgramming;

import java.util.Arrays;
import java.util.List;

public class FP03Functional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = Arrays.asList(1, 21, 34, 45, 12, 31, 141, 445, 12, 41, 14, 4,4,12,21, 12);
//		List<String> courses = Arrays.asList("Spring", "Spring Boot", "Spring MicroServices", "SQL", "MySQL",
//				"MANGODB");

		System.out.println("Sum of All Numbers");
		System.out.println(sumOfAllNumberInList(numbers));
		
		System.out.println("Sum of All Square Numbers");
		System.out.println(sumOfAllSquareNumberInList(numbers));
		
		System.out.println("Sum of All ODD Numbers");
		System.out.println(sumOfAllOddNumberInList(numbers));
		
		System.out.println("Max of all numbers");
		System.out.println(maxofAllNumbers(numbers));
		
		

	}

	private static int sumOfAllOddNumberInList(List<Integer> numbers) {
		// TODO Auto-generated method stub
		return numbers.stream()
				.filter(number->number%2!=0)
				.reduce(0, (x,y)->x+y);
	}

	private static int sumOfAllSquareNumberInList(List<Integer> numbers) {
		// TODO Auto-generated method stub
		return
				numbers.stream()
				.map(number->number*number)
				.reduce(0, (x,y)->x+y);
	}
	
	

	
	private static int maxofAllNumbers(List<Integer> numbers) {
		
		return
				numbers.stream()
				.reduce(0, (x,y)-> x>y ? x:y);
	}

	public static int sum(int a, int b) {
		System.out.println(a+" "+b);
		return a + b;
	}

	private static int sumOfAllNumberInList(List<Integer> numbers) {
		// TODO Auto-generated method stub

		return numbers.stream()
				//.reduce(0, FP02Functional::sum);
				.reduce(0, (x,y)->x+y);

	}
	
	

}
