package session2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentList {

	public static List<Student> getList() {
		
		return Arrays.asList(
				 new Student("Komal", 21, 45000.0),
				 new Student("Neeraj", 21, 45000.0),
				 new Student("Himesh", 21, 45000.0),
				 new Student("Raj", 21, 45000.0),
				 new Student("Jadu", 21, 45000.0)
				);
	}
	
	

}
