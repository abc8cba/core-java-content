package com.practice3.java8.streams.durgasoft;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

class MyyComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		
		return o1.length()-o2.length();
	}
	
}

public class TestCodeStreams {
	
	static int sortingNames(String o1, String o2){
		
			return -(o1.length()-o2.length());
		
	}
	
	static void sortStudentMarks(List<Integer> marks){ 
		
//	    List<Integer> list = marks.stream().sorted().collect(Collectors.toList());
//	    System.out.println(list);
//	    
//	    marks.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
//		marks.stream().sorted((m1,m2)->m1.compareTo(m2)).collect(Collectors.toList()).forEach(System.out::println);
//		marks.stream().sorted((m1,m2)->-m1.compareTo(m2)).collect(Collectors.toList()).forEach(System.out::println);
//		marks.stream().sorted((m1,m2)->(m1<m2)?-1:(m1>m2)?1:0).collect(Collectors.toList()).forEach(System.out::println);
		marks.stream().sorted((m1,m2)->(m1<m2)?1:(m1>m2)?-1:0).collect(Collectors.toList()).forEach(System.out::println);
		
		
	}
	
	static void sortStudentNames(){ 
		List<String> listNames = Arrays.asList("aaa","aaaa","aa","aaaaaa","aaaaa","aa","xx");
		//Comparator<String> c = TestCodeStreams::sortingNames;
		Comparator<String> c = (s1,s2)->{return -(s1.length()-s2.length());};
		listNames.stream().sorted(c).collect(Collectors.toList()).forEach(System.out::println);
		
	}

	static void filterStudentMarks(List<Integer> marks){
		
		//List of failed students
		System.out.println("------Failed students-------");
		marks.stream().filter(m->m<33).collect(Collectors.toList()).forEach(System.out::println);
		
		//List of passed student
		System.out.println("------Passed students-------");
		marks.stream().filter(m->m>=33).collect(Collectors.toList()).forEach(System.out::println);
	}
	
	static void mapStudentMarks(List<Integer> marks){
		
		marks.stream().map(m->m=m+5).collect(Collectors.toList()).forEach(System.out::println);
	}
	
	static void maxMinStudentMarks(List<Integer> marks){
		
		int maxMark = marks.stream().max((m1,m2)->m1.compareTo(m2)).get();
		System.out.println("Max marks = "+maxMark);
		int minMark = marks.stream().min((m1,m2)->m1.compareTo(m2)).get();
		System.out.println("Min marks = "+minMark);
	}
	
	static void countStudents(List<Integer> marks){
		long failedStudent = marks.stream().filter(m->m<33).count();
		System.out.println("Total Failed Student: "+failedStudent );
	}
	
	public static void main(String[] args) {
		List<Integer> marks = Arrays.asList(10,20,65,78,32,90);
		//marks.forEach(m->{System.out.println(m);m = m+5; System.out.println("After Grace: "+m);});		
		//sortStudentMarks(marks);
		//sortStudentNames();
		//filterStudentMarks(marks);
		//mapStudentMarks(marks);
		//maxMinStudentMarks(marks);
		//countStudents(marks);
		m1(marks);
	}
	
	static void m1(List<Integer> marks){
		marks.stream().forEach(System.out::println);
		Consumer<Integer> c = n->{n = n+100;System.out.println("After modification Result = "+n);};
		marks.stream().forEach(c);
	}

}
