package lamda.coding.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import required.db.content.Employee;
import required.db.content.EmployeeDB;

public class TestParallelStream {

	public static void main(String[] args) {
		// singleObjectList();
		// complexObjectList();

		//coding1();
		//coding2();
		coding3();
	}

	private static void coding3() {
		// Sequential Stream Execution
		long start = System.currentTimeMillis();
		EmployeeDB.getEmployees().stream().map(Employee::getSalary).mapToDouble(n->n).average().ifPresent(n->System.out.println("Average = "+n));		
		long end = System.currentTimeMillis();
		System.out.println("\nTime taken by sequential Stream Execution: " + (end - start));
		System.out.println("====================================================");

		// Sequential Stream Execution
		long start2 = System.currentTimeMillis();
		EmployeeDB.getEmployees().stream().parallel().map(Employee::getSalary).mapToDouble(n->n).average().ifPresent(n->System.out.println("Average = "+n));
		EmployeeDB.getEmployees().parallelStream().map(Employee::getSalary).mapToDouble(n->n).average().ifPresent(n->System.out.println("Average = "+n));
		long end2 = System.currentTimeMillis();
		System.out.println("\nTime taken by Parallel Stream Execution: " + (end2 - start2));

	}
	
	private static void coding2() {
		// Sequential Stream Execution
		long start = System.currentTimeMillis();
		IntStream.range(1, 100).forEach(n -> System.out.println(Thread.currentThread().getName()+" "+n) );
		long end = System.currentTimeMillis();
		System.out.println("\nTime taken by sequential Stream Execution: " + (end - start));
		System.out.println("====================================================");

		// Sequential Stream Execution
		long start2 = System.currentTimeMillis();
		//IntStream.range(1, 10).parallel().forEach(n -> System.out.println(Thread.currentThread().getName()+" "+n) );
		IntStream.range(1, 100).parallel().forEach(n -> System.out.println(Thread.currentThread().getName()+" "+n) );
		long end2 = System.currentTimeMillis();
		System.out.println("\nTime taken by Parallel Stream Execution: " + (end2 - start2));

	}

	private static void coding1() {
		// Sequential Stream Execution
		long start = System.currentTimeMillis();
		IntStream.range(1, 1000).forEach(n -> System.out.print(n) );
		long end = System.currentTimeMillis();
		System.out.println("\nTime taken by sequential Stream Execution: " + (end - start));

		// Sequential Stream Execution
		long start2 = System.currentTimeMillis();
		IntStream.range(1, 1000).parallel().forEach(n -> System.out.print(n) );
		long end2 = System.currentTimeMillis();
		System.out.println("\nTime taken by Parallel Stream Execution: " + (end2 - start2));

	}

	private static List<Employee> employees() {
		List<Employee> employeesList = new ArrayList<Employee>(1000);
		for (int i = 1; i <= 1000; i++) {
			employeesList.add(new Employee(1 + i, "Komal" + i, "A" + i, 100 + i));
		}

		return employeesList;
	}

	private static void complexObjectList() {

		// Sequential Stream Execution
		long start = System.currentTimeMillis();
		employees().stream().forEach(n -> System.out.print(n + " "));
		long end = System.currentTimeMillis();
		System.out.println("\nTime taken by sequential Stream Execution: " + (end - start));

		// Sequential Stream Execution
		long start2 = System.currentTimeMillis();
		// employees().stream().parallel().forEach(n -> System.out.print(n + " "));
		employees().parallelStream().forEach(n -> System.out.print(n + " "));
		// employees().parallelStream().forEachOrdered(n -> System.out.print(n + " "));
		long end2 = System.currentTimeMillis();
		System.out.println("\nTime taken by Parallel Stream Execution: " + (end2 - start2));
	}

	private static List<Integer> getListOfNumbers() {
		List<Integer> numbers = new ArrayList<Integer>(1000);
		for (int i = 1; i <= 1000; i++) {
			numbers.add(i);
		}

		return numbers;
	}

	private static void singleObjectList() {
		// Sequential Stream Execution
		long start = System.currentTimeMillis();
		getListOfNumbers().stream().forEach(n -> System.out.print(n + " "));
		long end = System.currentTimeMillis();
		System.out.println("\nTime taken by sequential Stream Execution: " + (end - start));

		// Sequential Stream Execution
		long start2 = System.currentTimeMillis();
		// getListOfNumbers().stream().parallel().forEach(n -> System.out.print(n + "
		// "));
		// getListOfNumbers().parallelStream().forEach(n -> System.out.print(n + " "));
		getListOfNumbers().parallelStream().forEachOrdered(n -> System.out.print(n + " "));
		long end2 = System.currentTimeMillis();
		System.out.println("\nTime taken by Parallel Stream Execution: " + (end2 - start2));
	}

}
