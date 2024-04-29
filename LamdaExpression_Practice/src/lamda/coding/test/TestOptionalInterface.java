package lamda.coding.test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import required.db.content.Customer;
import required.db.content.CustomerDB;

public class TestOptionalInterface {

	public static void main(String[] args) {
		Customer customer = new Customer(101, "Mohit", null, Arrays.asList("111","222"));
		//m1(customer);
		//m2(customer);
		m3();
	}
	
	static void m3() {
		List<Character> list1 = Arrays.asList('a','b','c','d','e');
		List<Character> list2 = Arrays.asList('a','d');
		
		List<Character> commonList = list1.stream()	.filter(list2::contains).collect(Collectors.toList());
		System.out.println(commonList);
	}

	private static void m2(Customer customer) {
		
		if(Optional.ofNullable(customer.getEmail()).isPresent()) {
			System.out.println("Email Id: "+customer.getId());
		}else {
			System.out.println("Email id is null");
		}
		
		System.out.println("----------------------------------------------");		 
		System.out.println(Optional.ofNullable(customer.getEmail()).isPresent() ? "Email Id: "+customer.getId() : "Email Id is not present");
		
		System.out.println("----------------------------------------------");
		String result = Optional.ofNullable(customer.getEmail()).isPresent() ? "Email Id: "+customer.getId() : "Email Id is not present";
		
		//Note: We can't do because ternary operation needed return value. It does not support void statement after ? mark.
		//Optional.ofNullable(customer.getEmail()).isPresent()!=null ? System.out.println("Email Id: "+customer.getId()) : System.out.println("Email id is null");
		
	}

	private static void m1(Customer customer) {
		Optional<Object> objOptional =  Optional.empty();
		System.out.println(objOptional);
		
//		Optional<String> emailOptional = Optional.of(customer.getEmail());
//		System.out.println(emailOptional);
		
		Optional<String> emailOptional = Optional.ofNullable((customer.getEmail()));
		System.out.println(emailOptional);
		System.out.println(emailOptional.orElse("default@gmail.com"));
		System.out.println(emailOptional.orElseGet(()->"deafult email"));
		System.out.println(emailOptional.map(String::toUpperCase).orElseGet(()->"deafultemail@gmail.com"));
		//System.out.println(emailOptional.orElseThrow(()->new IllegalArgumentException("Email is not present")));
		
		Customer customer2 = CustomerDB.getCustomerList()
			.stream().filter(c->c.getEmail().equals("abc2@gmail.com"))
			.findAny()
			.orElseThrow(()->new RuntimeException("No email matched in database.."));
		
		System.out.println(customer2);
		
	}

}
