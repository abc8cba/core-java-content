package lamda.coding.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

interface Inter1{
	void m1();
}

interface Inter2{
	void m1(int x,int y);
}

interface Inter3{
	void m1(List<Integer> list);
}


public class TestLamdaCode {

	public static void main(String[] args) {
		//method1();
		//method2();
		//method3();
		method4();
		//method5();
	}
	
	private static void method5() {
		List<Integer> myList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,18,20);
		
		System.out.println("Using Parellel Stream\n----------");
		myList.parallelStream().filter(n->n%2==0).map(num->num*num).forEach(System.out::println);
		
		System.out.println("\nUsing Stream\n----------");
		myList.stream().filter(n->n%2==0).map(num->num*num).forEach(System.out::println);
		
		//To get object array using toArray() method
//		Object[] list = myList.parallelStream().filter(n->n%2==0).map(num->num*num).toArray();
//		for(Object val : list) {
//			System.out.println(val);
//		}		
		
		//System.out.println(Runtime.getRuntime().availableProcessors());
		
	}

	private static void method4() {		
		List<Integer> list = Arrays.asList(9,5,4,2,6,3,7);
		
		//int secondHighestNum = numList.stream().distinct().sorted(Collections.reverseOrder()).limit(2).skip(0).collect(Collectors.toList()).get(1);
		int secondHighestNum = list.stream().distinct().sorted().collect(Collectors.toList()).get(list.size()-2);
		System.out.println("Second highest number in list: "+secondHighestNum);
		
		//To get lowest number in list
		int lowestNum = list.stream().distinct().sorted().findFirst().get();		
		System.out.println("Lowest Number in list: "+lowestNum);
		
		//To get highest number in list
		int highestNum = list.stream().distinct().sorted(Comparator.reverseOrder()).findFirst().get();
		System.out.println("Highest Number in list: "+highestNum);
		
		List<Integer> duplicatelist = Arrays.asList(9,5,3,4,2,6,4,3,7,4,5,9,4);
		
		//To get second highest number in list
		List<Integer> sortedList = duplicatelist.stream().distinct().sorted().collect(Collectors.toList());		
		System.out.println("Second Highest Number in list: "+sortedList.get(sortedList.size()-2));

		
		
	}
	
	private static void method3() {		
		List<Integer> numList = Arrays.asList(3,2,7,6,9,4,5,4,2,6,3);
		
		List<Integer> ditinctList = numList.stream().distinct().collect(Collectors.toList());
		System.out.println("Remove duplicates from list: "+ditinctList);
		
		List<Integer> ditinctSortedList = numList.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println("Remove duplicates from list in ascending order: "+ditinctSortedList);
		
		List<Integer> squareList = numList.stream().distinct().filter(num->num%2==0).map(n->n*n).collect(Collectors.toList());
		System.out.println("Square of even numbers in list: "+squareList);
		
		List<Integer> sortedList = numList.stream().sorted().distinct().collect(Collectors.toList());
		System.out.println("Sorted list in ascending order: "+sortedList);
		
		List<Integer> reverseList = numList.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("Sorted list in descending order: "+reverseList);
		
		
	}
	
	private static void method2() {
		Inter3 i3 = (list)->{
			for(int num : list) {
				if(num%2==0) {
					System.out.println(num);
				}
			}
		};
		
		List<Integer> numList = Arrays.asList(24,21,67,34,22,12,37);
		i3.m1(numList);
	}

	private static void method1() {
		
		Inter2 i2 = (a,b)->{
			System.out.println("Sum of two number = "+(a+b));
		};
		i2.m1(10,20);
		
		Inter1 i1 = ()->{
			System.out.println("m1() method implementation...");
		};
		i1.m1();
	}
	
	

}
