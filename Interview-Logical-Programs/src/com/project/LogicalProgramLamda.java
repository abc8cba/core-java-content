package com.project;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LogicalProgramLamda {

	public static void main(String[] args) {
		//printEvenOddUsingLamdaExpression();
		secondHighestNumber();
		
	}
	
	static void secondHighestNumber() {
		List<Integer> list = Arrays.asList(9,5,3,4,2,6,4,3,7,4,5,9,4);		
		
		//To get lowest number in list
		int lowestNum = list.stream().distinct().sorted().findFirst().get();		
		System.out.println("Lowest Number in list: "+lowestNum);
		
		//To get highest number in list
		int highestNum = list.stream().distinct().sorted(Comparator.reverseOrder()).findFirst().get();
		System.out.println("Highest Number in list: "+highestNum);
		
		//To get second highest number in list
		List<Integer> sortedList = list.stream().distinct().sorted().collect(Collectors.toList());		
		System.out.println("Second Highest Number in list: "+sortedList.get(sortedList.size()-2));
		
		
	}
	
	static void printEvenOddUsingLamdaExpression() {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
		list.stream()
			.filter(num->num%2==0)
			.forEach(x->System.out.println(x));
		
		list.stream()		
			.map(x->x%2==0)
			.collect(Collectors.toList())
			.forEach(x->System.out.println(x));
		
		/*map returns a stream consisting of the results of applying the given function to the elements of this stream. 
		 * In a simple sentence, the map returns the transformed object value.

		For example, transform the given Strings from Lower case to Upper case by using the map().

		myList.stream().map(s -> s.toUpperCase()).forEach(System.out::println);

		filter returns a stream consisting of the elements of this stream that match the given predicate. 
		In a simple sentence, the filter returns the stream of elements that satisfies the predicate.

		For example, find the strings which are starting with 'o' by using the filter.

		myList.stream().filter(s -> s.startsWith("o")).forEach(System.out::println);*/
		
		
	}

}
