package com.practice3.java8.streams.durgasoft;
import java.util.*;
import java.util.stream.Collectors;

interface Interf{
	void displayName();
	void displayAge();
}

class Employee{
	private int empId;
	private String Name;
	
	public Employee(int empId, String name) {
		this.empId = empId;
		Name = name;
	}
	public Employee() {
		
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", Name=" + Name + "]";
	}
}

public class TestCodeLamdaExpressions2 {
	
	static void ananymousTest(){
		
		Runnable r = new Runnable() {			
			@Override
			public void run() {
				
				for(int i=0; i<=10;i++){
					System.out.println("Child Thread: "+i);
				}
			}
		};
		Thread t = new Thread(r);
		t.start();
	}
	
	static void lamdaRunnableTest(){
		Runnable r = ()->{
			for(int i=0; i<=10;i++){
				System.out.println("Child Thread: "+i);
			}
		};
		Thread t = new Thread(r);
		t.start();
	}
	
	static void ananymousTest2(){
		Interf i = new Interf() {
			
			@Override
			public void displayName() {
				System.out.println("Name: "+"Sandeep Singh");
			}
			
			@Override
			public void displayAge() {
				System.out.println("Age = "+32);
			}
		};
		
		i.displayName();
		i.displayAge();
	}

	static void comparatorTest(){
		List<Employee> employees = Arrays.asList(
				new Employee(101,"sunny"),new Employee(105,"bunny"),new Employee(104,"hunny"),
				new Employee(102,"munny"),new Employee(103,"cunny")
		);
		
		employees.stream()
		.sorted(Comparator.comparing(Employee::getName))
		.collect(Collectors.toList())
		.forEach(System.out::println);		
		
//		System.out.println(employees);
//		//Comparator<Employee> c = (o1,o2)-> o2.getEmpId()-o1.getEmpId();
//		//Comparator<Employee> c = (o1,o2)-> o1.getName().compareTo(o2.getName());
//		Comparator<Employee> c = (o1,o2)-> (o1.getEmpId()< o2.getEmpId())?-1:(o1.getEmpId()>o2.getEmpId())?1:0;
//		Collections.sort(employees,c);
//		employees.stream().forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		//ananymousTest();
		//lamdaRunnableTest();
		//ananymousTest2();
		//comparatorTest();
	}

}


