package session1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class TestComparable {

	public static void main(String[] args) {
		//listOfIntegers();
		listOfEmployees();
	}

	private static void listOfEmployees() {
		
		LinkedList<Employee> list = new LinkedList<Employee>();
		//Vector<Employee> list = new Vector<Employee>();
		//ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(103, "Rakesh", 20000.0));
		list.add(new Employee(104, "Dakesh", 50000.0) );
		list.add(new Employee(101, "Jakesh", 30000.0));
		list.add(new Employee(105, "Pakesh", 70000.0));
		list.add(new Employee(102, "Hakesh", 25000.0));
		
		for(Employee emp:list) {
			System.out.println(emp);
		}
		
		System.out.println("--------------------After sorting--------------------");
		//Collections.sort(list);
		Collections.sort(list, new SortingBasedOnId());
		for(Employee emp:list) {
			System.out.println(emp);
		}
		
		System.out.println("--------------------sorting based on name--------------------");
		//Collections.sort(list);
		Collections.sort(list, new SortingBasedOnName());
		for(Employee emp:list) {
			System.out.println(emp);
		}
		
		System.out.println("--------------------sorting based on salary--------------------");
		//Collections.sort(list);
		Collections.sort(list, new SortingBasedOnSalary());
		for(Employee emp:list) {
			System.out.println(emp);
		}
		
	}

	private static void listOfIntegers() {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		//Vector<Integer> list= new Vector<Integer>();
		//LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(5);
		list.add(10);
		list.add(3);
		list.add(8);
		list.add(4);
		for(Integer num: list) {
			System.out.println(num);
		}
		System.out.println("After sorting");
		Collections.sort(list);
		for(Integer num: list) {
			System.out.println(num);
		}
		

	}

}
