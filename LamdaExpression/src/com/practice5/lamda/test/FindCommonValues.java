package com.practice5.lamda.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindCommonValues {
	
	static void m1() {
		List<String> list1 = Arrays.asList("a","b","c","d","e");
		List<String> list2 = Arrays.asList("c","d","a");
		List<String> commonData = list1.stream().filter(list2::contains)
				.collect(Collectors.toList());
		System.out.println(commonData);
	}
	
	static void m2() {
		int[] arr=new int[] {0,1,0,1,0,1};
		List<Integer> list = Arrays.asList(0,1,0,1,0,1);
		List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		List<Integer> list2  = Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		
		System.out.println(list2);
	}
	
	static void m3() {
		int arr[] = {2,34,12,34,35,90,23};
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		System.out.println(list);
		
		int secondHighestNum = Arrays.stream(arr).boxed().distinct().sorted(Collections.reverseOrder()).limit(2).skip(1).findFirst().get();
	    System.out.println(secondHighestNum);
	    
	    List<Double> list2 = Arrays.stream(arr).boxed().filter(x-> x%2==0).map(y-> Math.pow(y, 2)).collect(Collectors.toList());
		System.out.println(list2);
	}

	public static void main(String[] args) {
		//m1();
		//m2();
		m3();

	}

}
