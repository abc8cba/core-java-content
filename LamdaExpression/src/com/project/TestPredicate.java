package com.project;

import java.util.ArrayList;
import java.util.function.Predicate;

public class TestPredicate {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(43);
		list.add(10);
		list.add(2);
		list.add(50);
		list.add(70);
		list.add(25);
		
		Predicate<Integer> p1 = x -> x%2==0;
		Predicate<Integer> p2 = y -> y>30;
		for(Integer i : list){
//			if(p1.test(i)){
//				System.out.println(i);
//			}
			
//			if(p1.negate().test(i)){
//				System.out.println(i);
//			}
			
//			if(p1.and(p2).test(i)){
//				System.out.println(i);
//			}
			
			if(p1.or(p2).test(i)){
				System.out.println(i);
			}
		}
		

	}

}
