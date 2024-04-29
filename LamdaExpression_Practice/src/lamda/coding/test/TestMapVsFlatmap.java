package lamda.coding.test;

import java.util.stream.Collectors;

import required.db.content.CustomerDB;

public class TestMapVsFlatmap {

	public static void main(String[] args) {
		practice1();

	}

	private static void practice1() {
		CustomerDB.getCustomerList().stream()
			.map(c->c.getEmail())
			.collect(Collectors.toList())
			.forEach(System.out::println);
		
		System.out.println("------------------------------------------------------------");
		CustomerDB.getCustomerList().stream()
			.map(c->c.getPhoneNumbers())
			.collect(Collectors.toList())
			.forEach(System.out::println);
		
		System.out.println("------------------------------------------------------------");
		CustomerDB.getCustomerList().stream()
			.flatMap(c->c.getPhoneNumbers().stream())
			.collect(Collectors.toList())
			.forEach(System.out::println);
		
		System.out.println("------------------------------------------------------------");
		CustomerDB.getCustomerList().stream()
			.filter(c->c.getEmail().equals("pqr@gmail.com"))
			.collect(Collectors.toList())
			.forEach(System.out::println);
	
	
		
	}

}
