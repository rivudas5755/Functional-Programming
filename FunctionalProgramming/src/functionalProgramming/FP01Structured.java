package functionalProgramming;

import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printAllNumbersInListStrutured(List.of(12,3,1,4,5,12,31,134,4,1));
	}

	private static void printAllNumbersInListStrutured(List<Integer> numbers) {
		// TODO Auto-generated method stub
		
		for(int number: numbers )
		{
			System.out.println(number);
		}
		
		
	}

	
}
