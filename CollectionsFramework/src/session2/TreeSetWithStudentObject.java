package session2;

import java.util.TreeSet;

public class TreeSetWithStudentObject {

	public static void main(String[] args) {
		TreeSet<Student> set = new TreeSet<Student>();
		set.add(new Student("Raj", 21, 50000.0));
		set.add(new Student("Neha", 22, 40000.0));
		
		System.out.println(set);

	}

}
