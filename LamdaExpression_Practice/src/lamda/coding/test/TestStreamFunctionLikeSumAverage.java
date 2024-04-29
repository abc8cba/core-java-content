package lamda.coding.test;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

import required.db.content.Employee;
import required.db.content.EmployeeDB;
import required.db.content.MyCollections;
import required.db.content.Student;
import required.db.content.StudentDB;

public class TestStreamFunctionLikeSumAverage {

	public static void main(String[] args) {
		//practice1();
		//practice2();
		practice3();

	}
	
	private static void practice3() {
		String str = MyCollections.getUniqueStringList().stream().map(String::toString).collect(Collectors.joining(", "));		
		System.out.println(str);
		
		String str2 = MyCollections.getUniqueIntegerList().stream().map(Object::toString).collect(Collectors.joining(", "));			
		System.out.println(str2);
		 
		System.out.println("================================================================================================");
		Map<Boolean, List<Student>> passingFailingList =  StudentDB.getStudents().stream().collect(Collectors.partitioningBy(s->s.getMarks() >= 45));
		passingFailingList.entrySet().stream().forEach(entry->System.out.println(entry.getKey()+"  "+entry.getValue()));
		//System.out.println(passingFailingList );
		
	}

	private static void practice2() {
		EmployeeDB.getEmployees().stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);
		System.out.println("===================================================");
		
		System.out.println("Total salary summary = "+EmployeeDB.getEmployees().stream().collect(Collectors.summarizingDouble(Employee::getSalary)));
		//System.out.println("Total Id Summary = "+EmployeeDB.getEmployees().stream().collect(Collectors.summarizingLong(Employee::getId)));
		System.out.println("Total salary = "+EmployeeDB.getEmployees().stream().collect(Collectors.summingDouble((Employee::getSalary))));
		System.out.println("Average salary = "+EmployeeDB.getEmployees().stream().collect(Collectors.averagingDouble((Employee::getSalary))));
		System.out.println("Number of employees = "+EmployeeDB.getEmployees().stream().collect(Collectors.counting()));
		System.out.println("Minimum salary = "+EmployeeDB.getEmployees().stream().collect(Collectors.minBy(Comparator.comparing(Employee::getSalary))));
		System.out.println("Maximum salary = "+EmployeeDB.getEmployees().stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
		
		System.out.println("\n------------------------------------------------------------------------------");
		Map<String, Double> gradeWiseSalary = EmployeeDB.getEmployees().stream().collect(Collectors.groupingBy(Employee::getGrade, Collectors.summingDouble(Employee::getSalary)));		
		gradeWiseSalary.entrySet().stream().forEach(entry-> System.out.println(entry.getKey()+"  "+entry.getValue()));
		
		System.out.println("\n------------------------------------------------------------------------------");
		Map<String, List<Employee>> gradeWiseEmployees = EmployeeDB.getEmployees().stream().collect(Collectors.groupingBy(Employee::getGrade));		
		gradeWiseEmployees.entrySet().stream().forEach(entry-> System.out.println("Grade: "+entry.getKey()+" Employees are:  "+entry.getValue()));
		
		System.out.println("------------------------------------------------------------------------------");
		Entry<String, List<Employee>> gradeAEmployees= gradeWiseEmployees.entrySet().stream().filter(e->e.getKey().equals("A")).findAny().get();
		System.out.println("Grade A employees are: "+gradeAEmployees.getValue());
		
		System.out.println("------------------------------------------------------------------------------");
		Optional<Employee> emp = EmployeeDB.getEmployees().stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
		System.out.println("Employee name: "+emp.get().getName()+" Having highest Salary: "+emp.get().getSalary());
		Employee employee = EmployeeDB.getEmployees().stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary))).get();	
		System.out.println("Employee name: "+employee.getName()+" Having highest Salary: "+employee.getSalary());
	}

	private static void practice1() {
		
		EmployeeDB.getEmployees().stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);
		//EmployeeDB.getEmployees().stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(System.out::println);
		System.out.println("===================================================");
		
		double totalSum = EmployeeDB.getEmployees().stream().map(Employee::getSalary).mapToDouble(n->n).sum();
		System.out.println("Total Salary: "+totalSum);
		
		double average = EmployeeDB.getEmployees().stream().map(Employee::getSalary).mapToDouble(n->n).average().getAsDouble();
		System.out.println("Average Salary: "+average);
		
		double maxSalary = EmployeeDB.getEmployees().stream().map(Employee::getSalary).mapToDouble(sal->sal).max().getAsDouble();
		System.out.println("Max Salary: "+maxSalary);
		
		System.out.println("Total employees in list: "+EmployeeDB.getEmployees().stream().count());
		
		
		
	}

}
