package lamda.coding.test;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import required.db.content.Employee;
import required.db.content.EmployeeDB;
import required.db.content.MyCollections;

public class TestSortingUsingStream {

	public static void main(String[] args) {
		//practice();
		practice0();
		//practice1();
		//practice2();
		//practice3();
		//practice4();
		//System.out.println(practice5("no tax"));
	}
	private static void practice0() {		
		System.out.println("-----Sorting simple map-----------");
		MyCollections
			.getMap()
			.entrySet()
			.stream()
			.sorted(Map.Entry.comparingByKey())
			.forEach(System.out::println);
		System.out.println("-----Sorting simple map-----------");
		MyCollections.getMap().entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		System.out.println("-------------------Sorting complex map-----------------------");
		EmployeeDB.getEmployeesMap().entrySet().stream()
			.sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getId))).forEach(System.out::println);
		
		System.out.println("---------Sorting complex map in reverse order---------------");
		EmployeeDB.getEmployeesMap().entrySet().stream()
			.sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getName).reversed()))
			.forEach(System.out::println);
		
	}

	
	private static void practice() {
		System.out.println("---------------------With filter------------------------------");
		EmployeeDB.findAllEmployees().stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);
		System.out.println("---------------------With filter descending------------------------------");
		EmployeeDB.findAllEmployees().stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(System.out::println);
		System.out.println("---------------------With filter------------------------------");
		EmployeeDB.findAllEmployees().stream().sorted((e1,e2)->e1.getName().compareTo(e2.getName())).forEach(System.out::println);
		System.out.println("---------------------Without Filter------------------------------");
		EmployeeDB.findAllEmployees().stream().forEach(e->System.out.println(e));
		System.out.println("---------------------Without Filter------------------------------");
		EmployeeDB.findAllEmployees().forEach(e->System.out.println(e));
		System.out.println("---------------------Without Filter------------------------------");
		EmployeeDB.findAllEmployees().forEach(System.out::println);
		System.out.println("---------------------Filtering simple map------------------------------");
		MyCollections.getMap().entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		
	}

	private static List<Employee> practice5(String tax) {
		
		return tax.equalsIgnoreCase("tax")
					?EmployeeDB.getEmployees().stream().filter(emp->emp.getSalary()>50000).collect(Collectors.toList())
					:EmployeeDB.getEmployees().stream().filter(emp->emp.getSalary()<=50000).collect(Collectors.toList());		
	}

	private static void practice4() {
		//Using comparator expression
		EmployeeDB
			.getEmployeesMap().values().stream()
			.sorted(Comparator.comparing(Employee::getId))
			.forEach(e->System.out.println(e));	
		
		System.out.println("---------------------------------------------");
		EmployeeDB
			.getEmployeesMap().values().stream()
			.sorted(Comparator.comparing(Employee::getName))
			.forEach(e->System.out.println(e));		
				
		System.out.println("---------------------------------------------");
		List<Employee> list = EmployeeDB.getEmployeesMap().values().stream()
				.sorted(Comparator.comparing(Employee::getName))
				.collect(Collectors.toList());
		System.out.println(list);
	}

	private static void practice3() {
		
		System.out.println("---------------------------------------------------");
		EmployeeDB.getEmployeesMap().keySet().stream().sorted().forEach(k->System.out.println(k));	
		
		System.out.println("------------------------------------------------------");		
		EmployeeDB.getEmployeesMap().keySet().stream().sorted(Collections.reverseOrder()).forEach(k->System.out.println(k));
		
	}
	
	private static void practice2() {
		
		//Using lamda expression
		EmployeeDB
			.getEmployeesMap().entrySet().stream()
			.sorted((e1,e2)->e1.getKey().compareTo(e2.getKey()))
			.forEach(entry -> System.out.println("Key: "+entry.getKey()+" Object Value: "+entry.getValue()));	
		
		System.out.println("----------------------------------------------------------------------");
		EmployeeDB
			.getEmployeesMap().entrySet().stream()
			.sorted((e1,e2)->e1.getValue().getId()-e2.getValue().getId())
			.forEach(System.out::println);
		
		
	}

	private static void practice1() {
		EmployeeDB
			.getEmployeesMap().entrySet()
			.stream()
			.forEach(entry -> System.out.println("Key: "+entry.getKey()+" Object Value: "+entry.getValue()));
		
		System.out.println("---------------------------------------------------------------------");
		
		EmployeeDB.getEmployeesMap().
			forEach((key,value)->System.out.println(key+"  "+value));
		
		System.out.println("---------------------------------------------------------------------");
		EmployeeDB.getEmployeesMap().entrySet().stream()
			.forEach(obj->System.out.println(obj));
		
	}
	
	

}
