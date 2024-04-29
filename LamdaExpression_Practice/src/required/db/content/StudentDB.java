package required.db.content;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentDB {

	public static List<Student> getStudents() {
		
		return Stream.of(
					new Student("R105", "ROHIT", 56, 30000.0, "MUMBAI"),
					new Student("R106", "KULDEEP", 36, 60000.0, "THANE"),
					new Student("R104", "NILESH", 66, 70000.0, "MUMBAI"),
					new Student("R107", "MOHIT", 70, 80000.0, "NAGPUR"),
					new Student("R101", "RAJ", 34, 50000.0, "THANE"),
					new Student("R108", "ZUNER", 80, 20000.0, "MUMBAI"),
					new Student("R102", "YASH", 30, 40000.0, "NAGPUR"),
					new Student("R109", "TEENA", 55, 90000.0, "THANE"),
					new Student("R103", "HARISH", 90, 10000.0, "THANE")
				)
				.collect(Collectors.toList());
	}
}
