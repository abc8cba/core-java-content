package com.practice3.java8.streams.durgasoft;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

interface Interface1{
	void displayName();
}

@FunctionalInterface
interface Interface2{
	void calculate(int x, int y);
}

@FunctionalInterface
interface Interface3{
	String show();
}

class MyComparator implements Comparator<Integer>{
	
	int sortedArray(Integer o1, Integer o2){
		if(o1<o2)
			return -1;
		else if(o1>o2)
			return 1;
		else
			return 0;
	}

	@Override
	public int compare(Integer obj1, Integer obj2) {
		
		//return (obj1<obj2)?-1:(obj1>obj2)?1:0;
		//return sortedArray(obj1, obj2);  //OR
		return obj1-obj2;				   //OR
	}
	
}

public class TestCodeLamdaExpressions {
	
	private static void functionTest(){
		
		Function<Integer, Integer> square=i->i*i;
		int num = 7;
		System.out.println("Square of given number "+num+" : "+square.apply(num));
	}
	
	private static void predicateTest(){
		Predicate<Integer> p = i->i%2==0;
		System.out.println(p.test(6));
	}
	
	private static void functionalInterfaceTest(){
		Interface1 i1 = ()->System.out.println("Ravi Jha"); 
		i1.displayName();
		
		Interface2 i2 = (int a,int b)->System.out.println("Sum = "+(a+b));
		i2.calculate(12, 10);
		
		Interface3 i3 = ()->"Hello Sandeep";
		System.out.println(i3.show());
	}
	
	private static void childThreadTest(){
		Runnable r = ()->{
			for(int i=1;i<=10;i++)
				System.out.println("Child Thread : "+i);
			
		};
		Thread t = new Thread(r);
		t.start();
	}
	
	private static void comparatorTest(){
		List<Integer> list = Arrays.asList(12,45,8,23,20);
		System.out.println(list);
//		Collections.sort(list,new MyComparator());
//		System.out.println(list);
//		Comparator<Integer> c = (a,b)->(a<b)?-1:(a>b)?1:0;
		Comparator<Integer> c = (a,b)-> (a-b);  //OR
		Collections.sort(list,c);
//		System.out.println(list);
		list.stream().forEach(System.out::println);
		
	}
	
	

	public static void main(String[] args) {
		
		//functionTest();
		//predicateTest();
		//functionalInterfaceTest();
		
//		childThreadTest();		
//		for(int i=1;i<=10;i++)
//			System.out.println("Main Thread : "+i);
		
		comparatorTest();

	}

}
