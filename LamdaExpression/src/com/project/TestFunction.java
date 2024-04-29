package com.project;

import java.util.function.Function;
import java.util.function.Predicate;

class Student{
	String name;
	int marks;
	public Student(String name, int marks) {	
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}
}

public class TestFunction {

	public static void main(String[] args) {

		Student[] stud = {
				new Student("Tinny", 85),
				new Student("Hinny", 75),
				new Student("Sinny", 65),
				new Student("Binny", 55),
				new Student("Kinny", 45),
				new Student("Jinny", 35)					
		};
		
		Function<Student, String> fun = f->{
			if(f.marks>=80) return "A Grade";
			else if(f.marks>=60) return "B Grade";
			else if(f.marks>=50) return "C Grade";
			else if(f.marks>=40) return "D Grade";
			else  return "Failed";
		};
		
		for(Student s: stud){
			System.out.println("Name: "+s.name+" Marks: "+s.marks+"  Status: "+fun.apply(s));
			System.out.println();
		}
		
//		Predicate<Student> p = st-> st.marks>60;
//		
//		for(Student s: stud){
//			if(p.test(s)){
//				System.out.println(s.name);
//				System.out.println(s.marks+"\n");
//			}
//		}

	}

}
