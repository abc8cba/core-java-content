package com.practice3.java8.streams.durgasoft;

import java.util.function.Predicate;

public class PredicateTestFI {
	
	static void predicateTest1(){
		String[] str = {"sandeep","neha","Ram","keshav","Ravindra"}; 
		Predicate<String> p = s->s.length()<5;
		for(String st : str){
			if(p.test(st)){
				System.out.println(st);
			}
		}
	}
	
	static void predicateTest2(){
		int[] arr = {20, 4, 0, 30, 51, 18, 5, 7, 25};
		Predicate<Integer> p1 = n->n%2==0;
		Predicate<Integer> p2 = n->n > 10;
		for(Integer num : arr){
			//if(p1.test(num)) System.out.println(num);
			//if(p1.negate().test(num))System.out.println(num);
			//if(p1.and(p2).test(num))System.out.println(num);
			if(p1.or(p2).test(num))System.out.println(num);
		}
	}

	public static void main(String[] args) {
		//predicateTest1();
		predicateTest2();

	}

}
