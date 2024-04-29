package com.practice3.java8.streams.durgasoft;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.*;

class Teacher {
	String name;
	double salary;

	public Teacher(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

}

public class BiFunctionTest {

	static void m1() {
		BiPredicate<Integer, Integer> bp = (a, b) -> (a + b) % 2 == 0;
		System.out.println(bp.test(3, 9));
		System.out.println(bp.test(3, 8));
	}

	static void m2() {
		List<Teacher> teachers = new ArrayList<Teacher>();
		BiFunction<String, Double, Teacher> b = (n,s)->new Teacher(n, s);
		teachers.add(b.apply("Bihari Lal", 30000.0));
		teachers.add(b.apply("Ral Lal", 50000.0));
		teachers.add(b.apply("Keshiri Das", 10000.0));
		teachers.add(b.apply("Vimal Chandra", 20000.0));
		teachers.add(b.apply("Durga", 90000.0));
		
		for(Teacher t: teachers){
			System.out.println("Name: "+t.name);
			System.out.println("Salary: "+t.salary);
			System.out.println();
		}
	}
	
	static void m3() {
		List<Teacher> list = Arrays.asList(
				new Teacher("sunny", 12000.0),
				new Teacher("bunny", 16000.0),
				new Teacher("cunny", 19000.0),
				new Teacher("dunny", 10000.0),
				new Teacher("munny", 12000.0));
		
		BiConsumer<Teacher, Double> c = (t,d)->t.salary = t.salary+d;
		for(Teacher t: list){
			c.accept(t, 500.0);
			System.out.println(t.name+"  : "+t.salary);
		}
	}
	
	public static void main(String[] args) {

		//m1();
		//m2();
		m3();
	}

}
