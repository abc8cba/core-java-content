package required.db.content;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class EmployeeDB {

	public static List<Employee> getEmployees() {
		
		return Stream.of(
				new Employee(5, "RAVI", "C", 30000.0),
				new Employee(2, "NILESH", "A", 65000.0),
				new Employee(3, "KUMUD", "B", 36000.0),
				new Employee(6, "JOJO", "B", 45000.0),
				new Employee(1, "NEHA", "C", 24000.0),
				new Employee(4, "MAHESH", "A", 55000.0)
				).collect(Collectors.toList());
	}
	
	public static List<Employee> findAllEmployees(){
		
		return Arrays.asList(
				new Employee(5, "RAVI", "C", 30000.0),
				new Employee(2, "NILESH", "A", 65000.0),
				new Employee(3, "KUMUD", "B", 36000.0),
				new Employee(6, "JOJO", "B", 45000.0),
				new Employee(1, "NEHA", "C", 24000.0),
				new Employee(4, "MAHESH", "A", 55000.0));
	}
	
	public static Map<String, Employee> getEmployeesMap(){
		Map<String, Employee> map = new HashMap<String, Employee>();
		map.put("E101", new Employee(1, "Madhav", "C", 25000.0));
		map.put("E105", new Employee(5, "Keshav", "B", 55000.0));
		map.put("E103", new Employee(3, "Niranjan", "C", 29000.0));
		map.put("E102", new Employee(2, "Anupam", "A", 85000.0));
		map.put("E104", new Employee(4, "Mukesh", "B", 25000.0));
		map.put("E102", new Employee(7, "Lajpat", "A", 95000.0));
		map.put("E102", new Employee(6, "Neeraj", "B", 45000.0));
		return map;
	}
}

