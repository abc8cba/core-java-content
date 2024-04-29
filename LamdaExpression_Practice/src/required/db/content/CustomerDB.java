package required.db.content;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDB {
	
	public static List<Customer> getCustomerList(){
		
		return Stream.of(
				new Customer(103, "abc", "abc@gmail.com", Arrays.asList("111","222","333")),
				new Customer(101, "mno", "mno@gmail.com", Arrays.asList("444","555","666")),
				new Customer(104, "xyz", "xyz@gmail.com", Arrays.asList("777","888","999")),
				new Customer(102, "pqr", "pqr@gmail.com", Arrays.asList("1111","2222","3333"))
				
				
		).collect(Collectors.toList());
	}

}
