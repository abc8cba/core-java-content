package session2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class TestCursor {

	public static void main(String[] args) {
	
		//List<Student> list = StudentList.getList();
		
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Komal", 21, 45000.0));
		students.add(new Student("Neeraj", 24, 55000.0));
		students.add(new Student("Himesh", 22, 25000.0));
		students.add(new Student("Raj", 26, 65000.0));
		students.add(new Student("Jadu", 23, 35000.0));
		
		//System.out.println(students);
		
		//iterationUsingForEach(students);
		//iterationUsingIterator(students);
		//iterationUsingListIterator(students);
		iterationUsingEnumeration();
		
		

	}

	private static void iterationUsingEnumeration() {
		//ArrayList<Integer> list = new ArrayList<Integer>();
		Vector<Integer> list = new Vector<Integer>();
		list.add(10);
		list.add(50);
		list.add(20);
		list.add(80);
		list.add(40);
		list.add(30);
		
		Enumeration<Integer> elements = list.elements();
		
		while(elements.hasMoreElements()) {
			Integer element = elements.nextElement();
			System.out.println(element);
		}
		
		
	}

	private static void iterationUsingListIterator(List<Student> students) {
		ListIterator<Student> listIterator = students.listIterator();
		while(listIterator.hasNext()) {
			Student student = listIterator.next();
			System.out.println(student);
		}
		
		System.out.println("---------In reverse order----------------");
		ListIterator<Student> listIterator2 = students.listIterator(5);
		while(listIterator2.hasPrevious()) {
			Student student = listIterator2.previous();
			System.out.println(student);
		}
	}

	private static void iterationUsingIterator(List<Student> students) {
		Iterator<Student> iterator = students.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student);
		}
	}

	private static void iterationUsingForEach(List<Student> students) {
		for(Student student:students) {
			System.out.println(student);
		}
		
	}

}
