package session1;

import java.util.Comparator;

public class SortingBasedOnId implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		//return o1.getId() - o2.getId();//for asc order
		return o2.getId() - o1.getId();//for desc order
	}

}
