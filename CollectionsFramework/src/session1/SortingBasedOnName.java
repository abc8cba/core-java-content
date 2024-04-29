package session1;

import java.util.Comparator;

public class SortingBasedOnName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getName().compareTo(o2.getName());//for asc order
		//return o2.getName().compareTo(o1.getName());//for desc order
	}

}
