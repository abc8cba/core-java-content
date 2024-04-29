package lamda.coding.test;

import required.db.content.Employee;
import required.db.content.EmployeeDB;
import required.db.content.MyCollections;

public class TestMapInStream {
	public static void main(String[] args) {		
		practice1();
		//gradeWiseEmployeeSalary();
	}

	private static void gradeWiseEmployeeSalary() {
		double averageSalary = EmployeeDB.getEmployees()
				.stream()
				.filter(emp->emp.getGrade().equals("A"))
				.map(Employee::getSalary)
				//.map(e->e.getSalary())
				.mapToDouble(sal->sal).average().getAsDouble();
		
		
		
			
			System.out.println("Average A Grade Emp Salary: "+averageSalary);
		
	}

	private static void practice1() {
		
		MyCollections.getUniqueIntegerList()
			.stream()
			.filter(num -> num%2 != 0)
			.map(num-> num+10)
			.forEach(num ->System.out.println(num-10));
		
		EmployeeDB.getEmployees()
			.stream()
			.map(Employee::getName)
			.forEach(name -> {
				String modifiedName = name.toLowerCase().concat(" Jain");
				System.out.println(modifiedName);
			});
		
		EmployeeDB.getEmployees()
			.stream()
			.map(Employee::getName)
			.forEach(name -> {
				System.out.println(name+"  "+name.startsWith("M")+"  "+name.startsWith("R"));
			});
		
		
			
	}

}
