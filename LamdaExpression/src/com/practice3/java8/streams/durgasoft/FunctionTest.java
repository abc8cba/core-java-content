package com.practice3.java8.streams.durgasoft;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student{
	String name;
	int marks;
	
	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
}

public class FunctionTest {
	
	static void ex1(){
		Function<Integer, Integer> fun = n->n*n;
		System.out.println("Sqare value 4 = "+fun.apply(4));
		System.out.println("Sqare value 5 = "+fun.apply(5));
		
		Function<Integer, Integer> fun2 = n->n = n - 5;
		System.out.println(fun.andThen(fun2).apply(8));
		System.out.println(fun.compose(fun2).apply(8));
		
		System.out.println(Function.identity());
	}
	
	static void ex2(){
		Function<String, Integer> fun = s->s.length();
		System.out.println(fun.apply("Raghav Dinda"));		

		String str[] = {"Ram","Kumarswami","Hina","Komal"};		
		for(String s:str){
			System.out.println(s+" = "+fun.apply(s));
		}
	}

	static void ex3(){
		Student[] stud = {
				new Student("Ram", 100),new Student("Komal", 76), new Student("Nilesh", 65),
				new Student("Leela", 45),new Student("John", 30)
		};
		
		Function<Student, String> grade = s->{
			if(s.marks>80) return "A+ Grade with distinction";
			else if(s.marks>=70 && s.marks<80) return "A Grade";
			else if(s.marks>=60 && s.marks<70) return "A- Grade";
			else if(s.marks>=50 && s.marks<60) return "B Grade";
			else if(s.marks>=40 && s.marks<50) return "C Grade";
			else return "Fail";
		};
		
		Predicate<Student> p = s->{return s.marks>=60;};
		
		Consumer<Student> consumer = s->{
			System.out.println("Name: "+s.name);
			System.out.println("Marks: "+s.marks);
			System.out.println("Grade: "+grade.apply(s));
			System.out.println();
		};
		for(Student s:stud){
			if(p.test(s)){
				consumer.accept(s);
			}
		}
	}

	public static void main(String[] args) {
		//ex1();
		//ex2();
		ex3();

	}

}
